package io.github.dpplinh28.lucide.generator

import java.io.File
import java.nio.file.Files
import kotlin.test.AfterTest
import kotlin.test.BeforeTest
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class GeneratorTest {

    private val testDataDir = File("generator/test-data")
    private val templateDir = File("generator/templates")
    private lateinit var tempOutputDir: File
    private lateinit var generator: LucideGenerator

    @BeforeTest
    fun setup() {
        tempOutputDir = Files.createTempDirectory("lucide-gen-test").toFile()
        generator = LucideGenerator(testDataDir, tempOutputDir, templateDir)
    }

    @AfterTest
    fun teardown() {
        tempOutputDir.deleteRecursively()
    }

    @Test
    fun testToPascalCase() {
        with(generator) {
            assertEquals("Trophy", "trophy".toPascalCase())
            assertEquals("TriangleAlert", "triangle-alert".toPascalCase())
            assertEquals("TriangleDashed", "triangle_dashed".toPascalCase())
            assertEquals("MultiWordName", "multi word name".toPascalCase())
        }
    }

    @Test
    fun testParseIconMetadata() {
        val json = """
            {
              "tags": ["prize", "sports"],
              "categories": ["sports", "gaming"]
            }
        """.trimIndent()
        val metadata = generator.parseIconMetadata(json)
        assertEquals(listOf("prize", "sports"), metadata.tags)
        assertEquals(listOf("sports", "gaming"), metadata.categories)
    }

    @Test
    fun testConvertPathDataToCompose() {
        val d = "M 2,2 L 10,10 Z"
        val expected = """
            moveTo(2f, 2f)
            lineTo(10f, 10f)
            close()
        """.trimIndent()
        assertEquals(expected, generator.convertPathDataToCompose(d))
    }

    @Test
    fun testParseSvg() {
        // Test with trophy.svg which should exist in test-data
        val trophySvg = File(testDataDir, "svg/trophy.svg")
        assertTrue(trophySvg.exists(), "trophy.svg should exist in test-data")

        val paths = generator.parseSvg(trophySvg)
        assertTrue(paths.isNotEmpty(), "Should parse at least one path from trophy.svg")
    }

    @Test
    fun testFullGenerationFlow() {
        // We need to merge svg and JSON into one directory for the generator to pick them up
        val combinedDir = Files.createTempDirectory("lucide-combined").toFile()
        try {
            File(testDataDir, "svg").listFiles()?.forEach { it.copyTo(File(combinedDir, it.name)) }
            File(testDataDir, "json").listFiles()?.forEach { it.copyTo(File(combinedDir, it.name)) }

            val gen = LucideGenerator(combinedDir, tempOutputDir, templateDir)
            gen.generate()

            // Verify some files exist
            assertTrue(File(tempOutputDir, "all/Trophy.kt").exists())
            assertTrue(File(tempOutputDir, "all/Triangle.kt").exists())
            assertTrue(File(tempOutputDir, "all/TriangleAlert.kt").exists())
            assertTrue(File(tempOutputDir, "all/TriangleDashed.kt").exists())

            assertTrue(File(tempOutputDir, "categories/Sports.kt").exists())
            assertTrue(File(tempOutputDir, "categories/Gaming.kt").exists())

            assertTrue(File(tempOutputDir, "LucideIcons.kt").exists())
            assertTrue(File(tempOutputDir, "LucideMetadata.kt").exists())
            assertTrue(
                File(tempOutputDir, "metadata/LucideMetadataChunk0.kt").exists(),
                "Should generate chunk file in metadata dir"
            )

            // Verify content of one file
            val trophyContent = File(tempOutputDir, "all/Trophy.kt").readText()
            assertTrue(
                trophyContent.contains("public val Trophy: ImageVector"),
                "Should contain ImageVector declaration"
            )
            assertTrue(trophyContent.contains("lucidePath"), "Should contain lucidePath calls")

            val metadataContent = File(tempOutputDir, "LucideMetadata.kt").readText()
            assertTrue(
                metadataContent.contains("import io.github.dpplinh28.lucide.metadata.*"),
                "Main metadata should import chunks"
            )
            assertTrue(
                metadataContent.contains("lucideMetadata0"),
                "Main metadata should reference chunk0"
            )
        } finally {
            combinedDir.deleteRecursively()
        }
    }
}
