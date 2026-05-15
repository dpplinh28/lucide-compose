package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BookA") { strokeWidth ->
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
            lucidePath(strokeWidth) {
                moveToRelative(8f, 13f)
                lineToRelative(4f, -7f)
                lineToRelative(4f, 7f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.1f, 11f)
                horizontalLineToRelative(5.7f)
            }
}

public val LucideIcons.All.BookADefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BookA: ImageVector
    @Composable get() = BookADefinition.asImageVector()
