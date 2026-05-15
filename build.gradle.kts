import com.android.build.api.dsl.androidLibrary
import org.gradle.api.DefaultTask
import org.gradle.api.file.RegularFileProperty
import org.gradle.api.provider.Property
import org.gradle.api.tasks.*
import org.jetbrains.kotlin.gradle.dsl.JvmTarget

group = "io.github.thelacspace"
val lucideVersion = libs.versions.lucide.get()
val libraryPostfix = ""
version = "$lucideVersion$libraryPostfix"

val generateLucide by tasks.registering {
    group = "generation"
    description = "Generates Lucide icons from SVG files"
    dependsOn(":generator:generate")
    dependsOn(syncReadmeVersion)
}

abstract class SyncReadmeTask : DefaultTask() {
    @get:Input
    abstract val projectVersion: Property<String>

    @get:Input
    abstract val lucideVersion: Property<String>

    @get:InputFile
    @get:PathSensitive(PathSensitivity.RELATIVE)
    abstract val readmeFile: RegularFileProperty

    @TaskAction
    fun sync() {
        val file = readmeFile.get().asFile
        if (file.exists()) {
            val content = file.readText()
            val pVersion = projectVersion.get()
            val lVersion = lucideVersion.get()

            val updatedContent = content.replace(
                Regex("io\\.github\\.thelacspace:lucide-compose:[\\d\\.-]+"),
                "io.github.thelacspace:lucide-compose:$pVersion"
            ).replace(
                Regex("Lucide v[\\d\\.-]+"),
                "Lucide v$lVersion"
            ).replace(
                Regex("\\(v[\\d\\.-]+\\)"),
                "(v$lVersion)"
            ).replace(
                Regex("e\\.g\\., `[\\d\\.-]+`"),
                "e.g., `$pVersion`"
            )
            file.writeText(updatedContent)
        }
    }
}

val syncReadmeVersion by tasks.registering(SyncReadmeTask::class) {
    group = "documentation"
    description = "Syncs the project version to README.md"
    projectVersion.set(version.toString())
    lucideVersion.set(libs.versions.lucide.get())
    readmeFile.set(layout.projectDirectory.file("README.md"))
}

plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.androidLibrary)
    alias(libs.plugins.vanniktech.mavenPublish)
    alias(libs.plugins.composeMultiplatform)
    alias(libs.plugins.composeCompiler)
}

kotlin {
    jvm()
    androidLibrary {
        namespace = "io.github.thelacspace.lucide.compose"
        compileSdk = libs.versions.android.compileSdk.get().toInt()
        minSdk = libs.versions.android.minSdk.get().toInt()

        withJava() // enable java compilation support
        withHostTestBuilder {}.configure {}
        withDeviceTestBuilder {
            sourceSetTreeName = "test"
        }

        compilerOptions {
            jvmTarget.set(
                JvmTarget.JVM_11
            )
        }
    }
    iosX64()
    iosArm64()
    iosSimulatorArm64()

    sourceSets {
        commonMain.dependencies {
            implementation(libs.compose.runtime)
            implementation(libs.compose.foundation)
            implementation(libs.compose.ui)
        }
        jvmMain.dependencies {

        }
        jvmTest.dependencies {
            implementation(kotlin("test"))
        }
    }
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().configureEach {
    dependsOn(generateLucide)
}

mavenPublishing {
    publishToMavenCentral()

    signAllPublications()

    coordinates(group.toString(), "lucide-compose", version.toString())

    pom {
        name = "Lucide Compose"
        description = "Lucide Icons for Compose (Android/Multiplatform)"
        inceptionYear = "2026"
        url = "https://github.com/thelacspace/lucide-compose"
        licenses {
            license {
                name = "The Apache License, Version 2.0"
                url = "https://www.apache.org/licenses/LICENSE-2.0.txt"
                distribution = "https://www.apache.org/licenses/LICENSE-2.0.txt"
            }
        }
        developers {
            developer {
                id = "thelacspace"
                name = "The Lac's Space"
                email = "dpplinh28@gmail.com"
                url = "https://github.com/thelacspace"
            }
        }
        scm {
            url = "https://github.com/thelacspace/lucide-compose"
            connection = "scm:git:git://github.com/thelacspace/lucide-compose.git"
            developerConnection = "scm:git:ssh://github.com/thelacspace/lucide-compose.git"
        }
    }
}

