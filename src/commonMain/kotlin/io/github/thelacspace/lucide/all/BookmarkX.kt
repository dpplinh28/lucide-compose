package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BookmarkX") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(14.5f, 7.5f)
                lineToRelative(-5f, 5f)
            }
            lucidePath(strokeWidth) {
                moveTo(17f, 3f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(15f)
                arcToRelative(1f, 1f, 0f, false, true, -1.496f, .868f)
                lineToRelative(-4.512f, -2.578f)
                arcToRelative(2f, 2f, 0f, false, false, -1.984f, 0f)
                lineToRelative(-4.512f, 2.578f)
                arcTo(1f, 1f, 0f, false, true, 5f, 20f)
                verticalLineTo(5f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                close()
            }
            lucidePath(strokeWidth) {
                moveToRelative(9.5f, 7.5f)
                lineToRelative(5f, 5f)
            }
}

public val LucideIcons.All.BookmarkXDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BookmarkX: ImageVector
    @Composable get() = BookmarkXDefinition.asImageVector()
