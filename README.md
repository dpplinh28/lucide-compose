# Lucide Compose

[![Publish to Maven Central](https://github.com/dpplinh28/lucide-compose/actions/workflows/publish.yml/badge.svg)](https://github.com/dpplinh28/lucide-compose/actions/workflows/publish.yml)

A Kotlin Multiplatform library providing [Lucide Icons](https://lucide.dev/) (v1.16.0) as `ImageVector`s for Jetpack Compose and Compose Multiplatform.

## Features

- **Up-to-date**: Includes icons from **Lucide v1.16.0**.
- **Multiplatform support**: Works on Android, iOS, and JVM (Desktop).
- **Fully Customizable**: Adjust stroke width, color, and size globally or per icon.
- **Categorized**: Icons are organized into categories for easier discovery.
- **Type-safe**: Use icons directly as `ImageVector` objects.

## Installation

### For Compose Multiplatform (Common)

Add the following to your `commonMain` dependencies in `build.gradle.kts`:

```kotlin
sourceSets {
    commonMain.dependencies {
        implementation("io.github.dpplinh28:lucide-compose:1.16.0")
    }
}
```

### For Jetpack Compose (Android only)

Add the dependency to your app's `build.gradle.kts`:

```kotlin
dependencies {
    implementation("io.github.dpplinh28:lucide-compose:1.16.0")
}
```

*(Note: The version follows the format `[lucide-version]-[library-patch]`, e.g., `1.16.0`)*

## Usage

### Basic Usage

Use icons directly from the `LucideIcons` object. Each icon is available as a `@Composable` property that automatically resolves its configuration.

```kotlin
import androidx.compose.material3.Icon
import dev.lucide.LucideIcons
import dev.lucide.categories.Animals

@Composable
fun MyScreen() {
    Icon(
        imageVector = LucideIcons.Animals.Cat,
        contentDescription = "Cat Icon"
    )
}
```

### Global Customization

You can customize the appearance of all icons in a sub-tree using `LocalLucideIconConfig`:

```kotlin
import dev.lucide.LocalLucideIconConfig
import dev.lucide.LucideIconConfig

CompositionLocalProvider(
    LocalLucideIconConfig provides LucideIconConfig(
        strokeWidth = 1.5f,
        color = Color.Blue,
        size = 32.dp
    )
) {
    // Icons inside this provider will use the custom configuration
    Icon(imageVector = LucideIcons.Animals.Dog, contentDescription = "Dog")
}
```

### Individual Customization

If you need a specific icon with unique settings, you can use its `Definition` and convert it manually:

```kotlin
import dev.lucide.asImageVector

val customIcon = LucideIcons.Animals.BirdDefinition.asImageVector(
    size = 48.dp,
    strokeWidth = 3f
)

Icon(imageVector = customIcon, contentDescription = "Custom Bird")
```

## Categories

Icons are grouped into various categories including:

- **Accessibility**: `LucideIcons.Accessibility`
- **Animals**: `LucideIcons.Animals`
- **Arrows**: `LucideIcons.Arrows`
- **Buildings**: `LucideIcons.Buildings`
- **Communication**: `LucideIcons.Communication`
- **Devices**: `LucideIcons.Devices`
- **Finance**: `LucideIcons.Finance`
- **Navigation**: `LucideIcons.Navigation`
- **Weather**: `LucideIcons.Weather`
- ...and many more.

## Why Lucide Compose?

- **Type-safe**: Avoid string-based resource lookups.
- **Dynamic**: Change stroke width and size at runtime without extra XML assets.
- **Native**: Built using `ImageVector`, ensuring smooth integration with Compose's rendering engine.

## Development

### Generating Icons

The icons are generated from SVG files and metadata provided by the [Lucide project](https://github.com/lucide-icons/lucide).

1.  **Clone the Lucide repository**:
    ```bash
    git clone https://github.com/lucide-icons/lucide.git ../lucide
    ```
2.  **Configure the source directory**:
    Add `lucideIconsDir` to your `local.properties` pointing to the cloned repository:
    ```properties
    lucideIconsDir=../lucide
    ```
    Alternatively, you can pass it via command line:
    ```bash
    ./gradlew generateLucide -PlucideIconsDir=../lucide
    ```
3.  **Run Generation**:
    ```bash
    ./gradlew generateLucide
    ```
    The generation task is also hooked into the build process and will run automatically before Kotlin compilation.

## Publishing

To publish the library to a Maven repository:

1.  **Configure Credentials**: Add the following to your `local.properties` (or set as environment variables):
    ```properties
    ossrhUsername=your_username
    ossrhPassword=your_password
    signingKey=your_gpg_private_key
    signingPassword=your_gpg_passphrase
    ```
2.  **Run Publish Task**:
    ```bash
    ./gradlew :lucide-compose:publish
    ```

## License

This library is based on [Lucide Icons](https://lucide.dev/), which is licensed under the [ISC License](https://github.com/lucide-icons/lucide/blob/main/LICENSE).
