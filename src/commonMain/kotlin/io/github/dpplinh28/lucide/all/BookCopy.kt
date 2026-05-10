package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BookCopy") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(5f, 7f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(11f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.803f, 18f)
                horizontalLineTo(5f)
                arcToRelative(2f, 2f, 0f, false, false, 0f, 4f)
                horizontalLineToRelative(9.5f)
                arcToRelative(.5f, .5f, 0f, false, false, .5f, -.5f)
                verticalLineTo(21f)
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 15f)
                verticalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(9.5f)
                arcToRelative(.5f, .5f, 0f, false, true, .5f, .5f)
                verticalLineToRelative(14f)
                arcToRelative(.5f, .5f, 0f, false, true, -.5f, .5f)
                horizontalLineTo(11f)
                arcToRelative(2f, 2f, 0f, false, true, 0f, -4f)
                horizontalLineToRelative(10f)
            }
}

public val LucideIcons.All.BookCopyDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BookCopy: ImageVector
    @Composable get() = BookCopyDefinition.asImageVector()
