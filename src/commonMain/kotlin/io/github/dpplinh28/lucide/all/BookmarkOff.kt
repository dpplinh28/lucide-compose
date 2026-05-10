package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BookmarkOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(19f, 19f)
                verticalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, false, true, -1.496f, .868f)
                lineToRelative(-4.512f, -2.578f)
                arcToRelative(2f, 2f, 0f, false, false, -1.984f, 0f)
                lineToRelative(-4.512f, 2.578f)
                arcTo(1f, 1f, 0f, false, true, 5f, 20f)
                verticalLineTo(5f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(2f, 2f)
                lineToRelative(20f, 20f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.656f, 3f)
                horizontalLineTo(17f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(8.344f)
            }
}

public val LucideIcons.All.BookmarkOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BookmarkOff: ImageVector
    @Composable get() = BookmarkOffDefinition.asImageVector()
