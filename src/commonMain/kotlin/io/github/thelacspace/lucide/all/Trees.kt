package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Trees") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10f, 10f)
                verticalLineToRelative(.2f)
                arcTo(3f, 3f, 0f, false, true, 8.9f, 16f)
                horizontalLineTo(5f)
                arcToRelative(3f, 3f, 0f, false, true, -1f, -5.8f)
                verticalLineTo(10f)
                arcToRelative(3f, 3f, 0f, false, true, 6f, 0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(7f, 16f)
                verticalLineToRelative(6f)
            }
            lucidePath(strokeWidth) {
                moveTo(13f, 19f)
                verticalLineToRelative(3f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 19f)
                horizontalLineToRelative(8.3f)
                arcToRelative(1f, 1f, 0f, false, false, .7f, -1.7f)
                lineTo(18f, 14f)
                horizontalLineToRelative(.3f)
                arcToRelative(1f, 1f, 0f, false, false, .7f, -1.7f)
                lineTo(16f, 9f)
                horizontalLineToRelative(.2f)
                arcToRelative(1f, 1f, 0f, false, false, .8f, -1.7f)
                lineTo(13f, 3f)
                lineToRelative(-1.4f, 1.5f)
            }
}

public val LucideIcons.All.TreesDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Trees: ImageVector
    @Composable get() = TreesDefinition.asImageVector()
