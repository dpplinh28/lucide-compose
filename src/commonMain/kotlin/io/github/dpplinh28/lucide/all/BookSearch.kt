package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BookSearch") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11f, 22f)
                horizontalLineTo(5.5f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, -5f)
                horizontalLineToRelative(4.501f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(21f, 22f)
                lineToRelative(-1.879f, -1.878f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 19.5f)
                verticalLineToRelative(-15f)
                arcTo(2.5f, 2.5f, 0f, false, true, 5.5f, 2f)
                horizontalLineTo(18f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(8f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f, 18.0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, 6.0f, 0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, -6.0f, 0f)
            }
}

public val LucideIcons.All.BookSearchDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BookSearch: ImageVector
    @Composable get() = BookSearchDefinition.asImageVector()
