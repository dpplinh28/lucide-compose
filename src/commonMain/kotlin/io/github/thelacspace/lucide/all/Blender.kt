package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Blender") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(8f, 14f)
                arcToRelative(2f, 2f, 0f, false, false, -1.963f, 1.615f)
                lineToRelative(-1.018f, 5.193f)
                arcTo(1f, 1f, 0f, false, false, 6f, 22f)
                horizontalLineToRelative(12f)
                arcToRelative(1f, 1f, 0f, false, false, .981f, -1.192f)
                lineToRelative(-1.018f, -5.193f)
                arcTo(2f, 2f, 0f, false, false, 16f, 14f)
                close()
            }
            lucidePath(strokeWidth) {
                moveToRelative(17f, 2f)
                lineToRelative(-1f, 12f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.006f, 14f)
                lineTo(7f, 2f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.565f, 8.787f)
                arcTo(5f, 5f, 0f, false, false, 12f, 8f)
                arcToRelative(5f, 5f, 0f, false, true, 4.56f, -.75f)
            }
            lucidePath(strokeWidth) {
                moveTo(19f, 2f)
                horizontalLineTo(5f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(5f)
                arcToRelative(2f, 2f, 0f, false, false, .688f, 1.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 18f)
                horizontalLineToRelative(.01f)
            }
}

public val LucideIcons.All.BlenderDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Blender: ImageVector
    @Composable get() = BlenderDefinition.asImageVector()
