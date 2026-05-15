import java.util.Properties

plugins {
    kotlin("jvm")
}

dependencies {
    implementation(libs.kotlinx.serialization.json)
    implementation(libs.handlebars)
    testImplementation(kotlin("test"))
}

tasks.register<JavaExec>("generate") {
    group = "generation"
    classpath = sourceSets["main"].runtimeClasspath
    mainClass.set("io.github.dpplinh28.lucide.generator.MainKt")

    val localProperties = Properties().apply {
        val file = rootProject.file("local.properties")
        if (file.exists()) {
            file.inputStream().use { load(it) }
        }
    }

    val sourceDir = localProperties.getProperty("lucideIconsDir")
        ?: project.findProperty("lucideIconsDir") as String?

    val sourceFile = if (sourceDir != null) {
        rootProject.file(sourceDir)
    } else {
        project.file("test-data/svg")
    }

    val lucideVersion = libs.versions.lucide.get()

    // Output directory is relative to the root project
    val outputDir = rootProject.file("src/commonMain/kotlin/io/github/dpplinh28/lucide")
    val templateDir = project.file("templates")

    args(
        sourceFile.absolutePath,
        lucideVersion,
        outputDir.absolutePath,
        templateDir.absolutePath
    )
}
