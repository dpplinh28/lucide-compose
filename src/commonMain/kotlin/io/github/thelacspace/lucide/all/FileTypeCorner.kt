package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FileTypeCorner") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 22f)
                horizontalLineToRelative(6f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineTo(8f)
                arcToRelative(2.4f, 2.4f, 0f, false, false, -.706f, -1.706f)
                lineToRelative(-3.588f, -3.588f)
                arcTo(2.4f, 2.4f, 0f, false, false, 14f, 2f)
                horizontalLineTo(6f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(6f)
            }
            lucidePath(strokeWidth) {
                moveTo(14f, 2f)
                verticalLineToRelative(5f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(5f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 16f)
                verticalLineToRelative(-1.5f)
                arcToRelative(.5f, .5f, 0f, false, true, .5f, -.5f)
                horizontalLineToRelative(7f)
                arcToRelative(.5f, .5f, 0f, false, true, .5f, .5f)
                verticalLineTo(16f)
            }
            lucidePath(strokeWidth) {
                moveTo(6f, 22f)
                horizontalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(7f, 14f)
                verticalLineToRelative(8f)
            }
}

public val LucideIcons.All.FileTypeCornerDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FileTypeCorner: ImageVector
    @Composable get() = FileTypeCornerDefinition.asImageVector()
