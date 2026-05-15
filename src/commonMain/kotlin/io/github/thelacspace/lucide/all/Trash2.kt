package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Trash2") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10f, 11f)
                verticalLineToRelative(6f)
            }
            lucidePath(strokeWidth) {
                moveTo(14f, 11f)
                verticalLineToRelative(6f)
            }
            lucidePath(strokeWidth) {
                moveTo(19f, 6f)
                verticalLineToRelative(14f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineTo(7f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineTo(6f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 6f)
                horizontalLineToRelative(18f)
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 6f)
                verticalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(4f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(2f)
            }
}

public val LucideIcons.All.Trash2Definition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Trash2: ImageVector
    @Composable get() = Trash2Definition.asImageVector()
