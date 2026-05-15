package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Dog") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.25f, 16.25f)
                horizontalLineToRelative(1.5f)
                lineTo(12f, 17f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 14f)
                verticalLineToRelative(.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.42f, 11.247f)
                arcTo(13.152f, 13.152f, 0f, false, false, 4f, 14.556f)
                curveTo(4f, 18.728f, 7.582f, 21f, 12f, 21f)
                reflectiveCurveToRelative(8f, -2.272f, 8f, -6.444f)
                arcToRelative(11.702f, 11.702f, 0f, false, false, -.493f, -3.309f)
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 14f)
                verticalLineToRelative(.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.5f, 8.5f)
                curveToRelative(-.384f, 1.05f, -1.083f, 2.028f, -2.344f, 2.5f)
                curveToRelative(-1.931f, .722f, -3.576f, -.297f, -3.656f, -1f)
                curveToRelative(-.113f, -.994f, 1.177f, -6.53f, 4f, -7f)
                curveToRelative(1.923f, -.321f, 3.651f, .845f, 3.651f, 2.235f)
                arcTo(7.497f, 7.497f, 0f, false, true, 14f, 5.277f)
                curveToRelative(0f, -1.39f, 1.844f, -2.598f, 3.767f, -2.277f)
                curveToRelative(2.823f, .47f, 4.113f, 6.006f, 4f, 7f)
                curveToRelative(-.08f, .703f, -1.725f, 1.722f, -3.656f, 1f)
                curveToRelative(-1.261f, -.472f, -1.855f, -1.45f, -2.239f, -2.5f)
            }
}

public val LucideIcons.All.DogDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Dog: ImageVector
    @Composable get() = DogDefinition.asImageVector()
