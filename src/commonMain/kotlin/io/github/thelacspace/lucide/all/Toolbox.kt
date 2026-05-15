package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Toolbox") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16f, 12f)
                verticalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 6f)
                arcToRelative(2f, 2f, 0f, false, true, 1.414f, .586f)
                lineToRelative(4f, 4f)
                arcTo(2f, 2f, 0f, false, true, 22f, 12f)
                verticalLineToRelative(7f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineToRelative(-7f)
                arcToRelative(2f, 2f, 0f, false, true, .586f, -1.414f)
                lineToRelative(4f, -4f)
                arcTo(2f, 2f, 0f, false, true, 8f, 6f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 6f)
                verticalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                horizontalLineToRelative(-4f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(2f, 14f)
                horizontalLineToRelative(20f)
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 12f)
                verticalLineToRelative(4f)
            }
}

public val LucideIcons.All.ToolboxDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Toolbox: ImageVector
    @Composable get() = ToolboxDefinition.asImageVector()
