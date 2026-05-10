import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import org.gradle.api.publish.maven.MavenPublication
import org.gradle.api.publish.PublishingExtension
import org.gradle.plugins.signing.SigningExtension

group = "io.github.dpplinh28"
val lucideVersion = "1.14.0"
val libraryPostfix = "1" 
version = "$lucideVersion-$libraryPostfix"

plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.androidLibrary)
    alias(libs.plugins.composeMultiplatform)
    alias(libs.plugins.composeCompiler)
    id("maven-publish")
    id("signing")
}

kotlin {
    withSourcesJar()
    androidTarget {
        publishLibraryVariants("release")
        compilerOptions {
            jvmTarget.set(JvmTarget.JVM_17)
        }
    }

    listOf(
        iosArm64(),
        iosSimulatorArm64(),
    ).forEach { iosTarget ->
        iosTarget.binaries.framework {
            baseName = "LucideCompose"
            isStatic = true
            version = project.version.toString()
        }
    }

    jvm()

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

android {
    namespace = "io.github.dpplinh28.lucide"
    compileSdk =
        libs.versions.android.compileSdk
            .get()
            .toInt()
    defaultConfig {
        minSdk =
            libs.versions.android.minSdk
                .get()
                .toInt()
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}

val javadocJar by tasks.registering(Jar::class) {
    archiveClassifier.set("javadoc")
}

publishing {
    publications.withType<MavenPublication> {
        artifact(javadocJar)
        pom {
            name.set("Lucide Compose")
            description.set("Lucide Icons for Compose (Android/Multiplatform)")
            url.set("https://github.com/dpplinh28/lucide-compose")
            licenses {
                license {
                    name.set("ISC License")
                    url.set("https://github.com/lucide-icons/lucide/blob/main/LICENSE")
                }
            }
            developers {
                developer {
                    id.set("dpplinh28")
                    name.set("Linh Do")
                    email.set("dpplinh28@gmail.com")
                }
            }
            scm {
                connection.set("scm:git:git://github.com/dpplinh28/lucide-compose.git")
                developerConnection.set("scm:git:ssh://github.com/dpplinh28/lucide-compose.git")
                url.set("https://github.com/dpplinh28/lucide-compose")
            }
        }
    }
    repositories {
        maven {
            val releasesRepoUrl = uri("https://s01.oss.sonatype.org/service/local/staging/deploy/maven2/")
            val snapshotsRepoUrl = uri("https://s01.oss.sonatype.org/content/repositories/snapshots/")
            url = if (version.toString().endsWith("SNAPSHOT")) snapshotsRepoUrl else releasesRepoUrl
            credentials {
                username = project.findProperty("ossrhUsername")?.toString() ?: System.getenv("OSSRH_USERNAME")
                password = project.findProperty("ossrhPassword")?.toString() ?: System.getenv("OSSRH_PASSWORD")
            }
        }
    }
}

signing {
    val signingKey = (project.findProperty("signingKey")?.toString() ?: System.getenv("SIGNING_KEY"))?.replace("\\n", "\n")
    val signingPassword = project.findProperty("signingPassword")?.toString() ?: System.getenv("SIGNING_PASSWORD")
    if (signingKey != null && signingPassword != null) {
        useInMemoryPgpKeys(signingKey, signingPassword)
        sign(publishing.publications)
    }
}
