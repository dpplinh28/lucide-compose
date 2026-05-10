package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BookmarkCheck") { strokeWidth ->
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
                moveToRelative(9f, 10f)
                lineToRelative(2f, 2f)
                lineToRelative(4f, -4f)
            }
}

public val LucideIcons.All.BookmarkCheckDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BookmarkCheck: ImageVector
    @Composable get() = BookmarkCheckDefinition.asImageVector()
