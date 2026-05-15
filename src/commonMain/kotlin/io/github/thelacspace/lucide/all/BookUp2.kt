package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BookUp2") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 13f)
                verticalLineTo(7f)
            }
            lucidePath(strokeWidth) {
                moveTo(18f, 2f)
                horizontalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(18f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                horizontalLineTo(6.5f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, -5f)
                horizontalLineTo(20f)
            }
            lucidePath(strokeWidth) {
                moveTo(4f, 19.5f)
                verticalLineToRelative(-15f)
                arcTo(2.5f, 2.5f, 0f, false, true, 6.5f, 2f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(9f, 10f)
                lineToRelative(3f, -3f)
                lineToRelative(3f, 3f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(9f, 5f)
                lineToRelative(3f, -3f)
                lineToRelative(3f, 3f)
            }
}

public val LucideIcons.All.BookUp2Definition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BookUp2: ImageVector
    @Composable get() = BookUp2Definition.asImageVector()
