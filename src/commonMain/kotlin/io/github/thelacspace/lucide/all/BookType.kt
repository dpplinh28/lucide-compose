package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BookType") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10f, 13f)
                horizontalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 6f)
                verticalLineToRelative(7f)
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 8f)
                verticalLineTo(6f)
                horizontalLineTo(8f)
                verticalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(4f, 19.5f)
                verticalLineToRelative(-15f)
                arcTo(2.5f, 2.5f, 0f, false, true, 6.5f, 2f)
                horizontalLineTo(19f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(18f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                horizontalLineTo(6.5f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, -5f)
                horizontalLineTo(20f)
            }
}

public val LucideIcons.All.BookTypeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BookType: ImageVector
    @Composable get() = BookTypeDefinition.asImageVector()
