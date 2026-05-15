package io.github.dpplinh28.lucide.generator

import com.github.jknack.handlebars.Handlebars
import com.github.jknack.handlebars.io.FileTemplateLoader
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.jsonArray
import kotlinx.serialization.json.jsonObject
import kotlinx.serialization.json.jsonPrimitive
import org.w3c.dom.Element
import java.io.File
import javax.xml.parsers.DocumentBuilderFactory

data class IconMetadata(
    val tags: List<String> = emptyList(),
    val categories: List<String> = emptyList()
)

class LucideGenerator(
    private val sourceDir: File,
    private val outputDir: File,
    private val templateDir: File,
    private val version: String
) {
    private val handlebars = Handlebars(FileTemplateLoader(templateDir, ".hbs"))

    fun generate() {
        if (!sourceDir.exists()) {
            println("Source directory ${sourceDir.absolutePath} does not exist.")
            return
        }

        prepareOutputDirectories()

        val svgFiles = sourceDir.listFiles { file -> file.extension == "svg" } ?: emptyArray()
        val jsonFiles = sourceDir.listFiles { file -> file.extension == "json" }
            ?.associateBy { it.nameWithoutExtension } ?: emptyMap()

        println("Found ${svgFiles.size} icons.")

        val categoryMap = mutableMapOf<String, MutableList<String>>()
        val allIconsMetadata = mutableListOf<Map<String, Any>>()

        svgFiles.sortedBy { it.name }.forEach { svgFile ->
            val originalName = svgFile.nameWithoutExtension
            val iconName = originalName.toPascalCase()

            val metadata = jsonFiles[originalName]?.let { jsonFile ->
                parseIconMetadata(jsonFile.readText())
            } ?: IconMetadata()

            metadata.categories.forEach { category ->
                categoryMap.getOrPut(category) { mutableListOf() }.add(iconName)
            }

            allIconsMetadata.add(
                mapOf(
                "name" to iconName,
                "tags" to metadata.tags.joinToString(", ") { "\"$it\"" },
                "categories" to metadata.categories.joinToString(", ") { "\"$it\"" }
            ))

            generateIconFile(svgFile, iconName)
        }

        generateCategories(categoryMap)
        generateMainObject(categoryMap.keys.sorted())
        generateMetadata(allIconsMetadata)

        println("Generation complete.")
    }

    private fun prepareOutputDirectories() {
        // Clean up old generated files but preserve manually created ones
        File(outputDir, "all").deleteRecursively()
        File(outputDir, "categories").deleteRecursively()
        File(outputDir, "metadata").deleteRecursively()
        File(outputDir, "LucideIcons.kt").delete()
        File(outputDir, "LucideMetadata.kt").delete()

        File(outputDir, "all").mkdirs()
        File(outputDir, "categories").mkdirs()
        File(outputDir, "metadata").mkdirs()
    }

    fun parseIconMetadata(jsonContent: String): IconMetadata {
        return try {
            val element = Json.parseToJsonElement(jsonContent).jsonObject
            val tags = element["tags"]?.jsonArray?.map { it.jsonPrimitive.content } ?: emptyList()
            val categories =
                element["categories"]?.jsonArray?.map { it.jsonPrimitive.content } ?: emptyList()
            IconMetadata(tags, categories)
        } catch (_: Exception) {
            IconMetadata()
        }
    }

    private fun generateIconFile(svgFile: File, iconName: String) {
        val pathsData = parseSvg(svgFile)
        val pathsCode = pathsData.joinToString("\n            ") { path ->
            val indentedPath =
                convertPathDataToCompose(path).lines().joinToString("\n                ")
            """lucidePath(strokeWidth) {
                $indentedPath
            }"""
        }

        val template = handlebars.compile("icon")
        val content = template.apply(
            mapOf(
                "name" to iconName,
                "paths" to pathsCode
            )
        )

        File(outputDir, "all/$iconName.kt").writeText(content.trim() + "\n")
    }

    fun parseSvg(file: File): List<String> {
        val dbf = DocumentBuilderFactory.newInstance()
        val db = dbf.newDocumentBuilder()
        val doc = db.parse(file)
        val svgElement = doc.documentElement

        val paths = mutableListOf<String>()
        val nodes = svgElement.childNodes
        for (i in 0 until nodes.length) {
            val node = nodes.item(i)
            if (node is Element) {
                when (node.tagName) {
                    "path" -> paths.add(node.getAttribute("d"))
                    "circle" -> {
                        val cx = node.getAttribute("cx").toFloat()
                        val cy = node.getAttribute("cy").toFloat()
                        val r = node.getAttribute("r").toFloat()
                        paths.add("M ${cx - r},$cy a $r,$r 0 1,0 ${r * 2},0 a $r,$r 0 1,0 -${r * 2},0")
                    }

                    "rect" -> {
                        val x =
                            node.getAttribute("x").let { if (it.isEmpty()) 0f else it.toFloat() }
                        val y =
                            node.getAttribute("y").let { if (it.isEmpty()) 0f else it.toFloat() }
                        val w = node.getAttribute("width").toFloat()
                        val h = node.getAttribute("height").toFloat()
                        val rx =
                            node.getAttribute("rx").let { if (it.isEmpty()) 0f else it.toFloat() }
                        val ry =
                            node.getAttribute("ry").let { if (it.isEmpty()) 0f else it.toFloat() }
                        if (rx > 0 || ry > 0) {
                            paths.add("M ${x + rx},$y h ${w - rx * 2} a $rx,$ry 0 0,1 $rx,$ry v ${h - ry * 2} a $rx,$ry 0 0,1 -$rx,$ry h -${w - rx * 2} a $rx,$ry 0 0,1 -$rx,-$ry v -${h - ry * 2} a $rx,$ry 0 0,1 $rx,-$ry Z")
                        } else {
                            paths.add("M $x,$y h $w v $h h -$w Z")
                        }
                    }

                    "line" -> {
                        val x1 = node.getAttribute("x1")
                        val y1 = node.getAttribute("y1")
                        val x2 = node.getAttribute("x2")
                        val y2 = node.getAttribute("y2")
                        paths.add("M $x1,$y1 L $x2,$y2")
                    }

                    "polyline", "polygon" -> {
                        val pointsAttr = node.getAttribute("points").trim()
                        if (pointsAttr.isNotEmpty()) {
                            val points = pointsAttr.split(Regex("[\\s,]+"))
                            if (points.size >= 2) {
                                var d = "M ${points[0]},${points[1]}"
                                for (j in 2 until points.size step 2) {
                                    d += " L ${points[j]},${points[j + 1]}"
                                }
                                if (node.tagName == "polygon") d += " Z"
                                paths.add(d)
                            }
                        }
                    }
                }
            }
        }
        return paths
    }

    fun convertPathDataToCompose(d: String): String {
        val tokens = Regex("([a-zA-Z])|([-+]?\\d*\\.?\\d+)").findAll(d).map { it.value }.toList()
        val sb = StringBuilder()
        var i = 0
        var currentCommand = ""

        while (i < tokens.size) {
            val token = tokens[i]
            if (token[0].isLetter()) {
                currentCommand = token
                i++
            }

            if (i >= tokens.size && currentCommand.lowercase() != "z") break

            try {
                when (currentCommand) {
                    "M" -> {
                        sb.append("moveTo(${tokens[i]}f, ${tokens[i + 1]}f)\n"); i += 2
                    }

                    "m" -> {
                        sb.append("moveToRelative(${tokens[i]}f, ${tokens[i + 1]}f)\n"); i += 2
                    }

                    "L" -> {
                        sb.append("lineTo(${tokens[i]}f, ${tokens[i + 1]}f)\n"); i += 2
                    }

                    "l" -> {
                        sb.append("lineToRelative(${tokens[i]}f, ${tokens[i + 1]}f)\n"); i += 2
                    }

                    "H" -> {
                        sb.append("horizontalLineTo(${tokens[i]}f)\n"); i += 1
                    }

                    "h" -> {
                        sb.append("horizontalLineToRelative(${tokens[i]}f)\n"); i += 1
                    }

                    "V" -> {
                        sb.append("verticalLineTo(${tokens[i]}f)\n"); i += 1
                    }

                    "v" -> {
                        sb.append("verticalLineToRelative(${tokens[i]}f)\n"); i += 1
                    }

                    "C" -> {
                        sb.append("curveTo(${tokens[i]}f, ${tokens[i + 1]}f, ${tokens[i + 2]}f, ${tokens[i + 3]}f, ${tokens[i + 4]}f, ${tokens[i + 5]}f)\n"); i += 6
                    }

                    "c" -> {
                        sb.append("curveToRelative(${tokens[i]}f, ${tokens[i + 1]}f, ${tokens[i + 2]}f, ${tokens[i + 3]}f, ${tokens[i + 4]}f, ${tokens[i + 5]}f)\n"); i += 6
                    }

                    "S" -> {
                        sb.append("reflectiveCurveTo(${tokens[i]}f, ${tokens[i + 1]}f, ${tokens[i + 2]}f, ${tokens[i + 3]}f)\n"); i += 4
                    }

                    "s" -> {
                        sb.append("reflectiveCurveToRelative(${tokens[i]}f, ${tokens[i + 1]}f, ${tokens[i + 2]}f, ${tokens[i + 3]}f)\n"); i += 4
                    }

                    "Q" -> {
                        sb.append("quadTo(${tokens[i]}f, ${tokens[i + 1]}f, ${tokens[i + 2]}f, ${tokens[i + 3]}f)\n"); i += 4
                    }

                    "q" -> {
                        sb.append("quadToRelative(${tokens[i]}f, ${tokens[i + 1]}f, ${tokens[i + 2]}f, ${tokens[i + 3]}f)\n"); i += 4
                    }

                    "T" -> {
                        sb.append("reflectiveQuadTo(${tokens[i]}f, ${tokens[i + 1]}f)\n"); i += 2
                    }

                    "t" -> {
                        sb.append("reflectiveQuadToRelative(${tokens[i]}f, ${tokens[i + 1]}f)\n"); i += 2
                    }

                    "A" -> {
                        val largeArc = tokens[i + 3].toFloat().toInt() == 1
                        val sweep = tokens[i + 4].toFloat().toInt() == 1
                        sb.append("arcTo(${tokens[i]}f, ${tokens[i + 1]}f, ${tokens[i + 2]}f, $largeArc, $sweep, ${tokens[i + 5]}f, ${tokens[i + 6]}f)\n")
                        i += 7
                    }

                    "a" -> {
                        val largeArc = tokens[i + 3].toFloat().toInt() == 1
                        val sweep = tokens[i + 4].toFloat().toInt() == 1
                        sb.append("arcToRelative(${tokens[i]}f, ${tokens[i + 1]}f, ${tokens[i + 2]}f, $largeArc, $sweep, ${tokens[i + 5]}f, ${tokens[i + 6]}f)\n")
                        i += 7
                    }

                    "Z", "z" -> {
                        sb.append("close()\n")
                    }

                    else -> {
                        i++
                    }
                }
            } catch (e: Exception) {
                println("Error parsing tokens for command $currentCommand: ${e.message}")
                break
            }

            if (i < tokens.size && !tokens[i][0].isLetter() && currentCommand.lowercase() != "z") {
                if (currentCommand.lowercase() == "m") currentCommand =
                    if (currentCommand == "m") "l" else "L"
            } else {
                currentCommand = ""
            }
        }
        return sb.toString().trim()
    }

    private fun generateCategories(categoryMap: Map<String, List<String>>) {
        val template = handlebars.compile("category")
        categoryMap.forEach { (category, icons) ->
            val className = category.toPascalCase()
            val content = template.apply(
                mapOf(
                    "className" to className,
                    "icons" to icons.sorted()
                )
            )
            File(outputDir, "categories/$className.kt").writeText(content.trim() + "\n")
        }
    }

    private fun generateMainObject(categoryNames: List<String>) {
        val template = handlebars.compile("lucide_icons")
        val categories = categoryNames.map {
            mapOf(
                "name" to it.toPascalCase(),
                "className" to it.toPascalCase()
            )
        }
        val content = template.apply(mapOf("categories" to categories))
        File(outputDir, "LucideIcons.kt").writeText(content.trim() + "\n")
    }

    private fun generateMetadata(icons: List<Map<String, Any>>) {
        val chunks = icons.chunked(100)
        val metadataDir = File(outputDir, "metadata")

        val chunkTemplate = handlebars.compile("metadata_chunk")
        chunks.forEachIndexed { index, chunk ->
            val content = chunkTemplate.apply(
                mapOf(
                    "index" to index,
                    "icons" to chunk
                )
            )
            File(metadataDir, "LucideMetadata$index.kt").writeText(content.trim() + "\n")
        }

        val mainTemplate = handlebars.compile("metadata")
        val content = mainTemplate.apply(
            mapOf(
                "chunkIndexes" to chunks.indices.toList(),
                "version" to version
            )
        )
        File(outputDir, "LucideMetadata.kt").writeText(content.trim() + "\n")
    }

    fun String.toPascalCase(): String {
        return this.split("-", "_", " ")
            .filter { it.isNotEmpty() }
            .joinToString("") { it.lowercase().replaceFirstChar { char -> char.uppercase() } }
    }
}
