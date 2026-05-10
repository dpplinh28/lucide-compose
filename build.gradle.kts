import com.android.build.api.dsl.androidLibrary
import org.jetbrains.kotlin.gradle.dsl.JvmTarget

group = "io.github.dpplinh28"
val lucideVersion = "1.14.0"
val libraryPostfix = "1"
version = "$lucideVersion-$libraryPostfix"

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
        namespace = "io.github.dpplinh28.lucide.compose"
        compileSdk = libs.versions.android.compileSdk.get().toInt()
        minSdk = libs.versions.android.minSdk.get().toInt()

        withJava() // enable java compilation support
        withHostTestBuilder {}.configure {}
        withDeviceTestBuilder {
            sourceSetTreeName = "test"
        }

        compilations.configureEach {
            compilerOptions.configure {
                jvmTarget.set(
                    JvmTarget.JVM_11
                )
            }
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
        val jvmMain by getting {
            dependencies {
                implementation(libs.kotlinx.serialization.json)
                implementation(libs.handlebars)
            }
        }
        val jvmTest by getting {
            dependencies {
                implementation(kotlin("test"))
                implementation(libs.kotlinx.serialization.json)
                implementation(libs.handlebars)
            }
        }
    }
}

mavenPublishing {
    publishToMavenCentral()

    signAllPublications()

    coordinates(group.toString(), "lucide-compose", version.toString())

    pom {
        name = "Lucide Compose"
        description = "Lucide Icons for Compose (Android/Multiplatform)"
        inceptionYear = "2026"
        url = "https://github.com/dpplinh28/lucide-compose"
        licenses {
            license {
                name = "The Apache License, Version 2.0"
                url = "https://www.apache.org/licenses/LICENSE-2.0.txt"
                distribution = "https://www.apache.org/licenses/LICENSE-2.0.txt"
            }
        }
        developers {
            developer {
                id = "dpplinh28"
                name = "Linh Do"
                email = "dpplinh28@gmail.com"
                url = "https://github.com/dpplinh28"
            }
        }
        scm {
            url = "https://github.com/dpplinh28/lucide-compose"
            connection = "scm:git:git://github.com/dpplinh28/lucide-compose.git"
            developerConnection = "scm:git:ssh://github.com/dpplinh28/lucide-compose.git"
        }
    }
}

