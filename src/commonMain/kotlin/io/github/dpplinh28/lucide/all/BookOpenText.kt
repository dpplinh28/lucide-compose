package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BookOpenText") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 7f)
                verticalLineToRelative(14f)
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 12f)
                horizontalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 8f)
                horizontalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 18f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                verticalLineTo(4f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                horizontalLineToRelative(5f)
                arcToRelative(4f, 4f, 0f, false, true, 4f, 4f)
                arcToRelative(4f, 4f, 0f, false, true, 4f, -4f)
                horizontalLineToRelative(5f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(13f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                horizontalLineToRelative(-6f)
                arcToRelative(3f, 3f, 0f, false, false, -3f, 3f)
                arcToRelative(3f, 3f, 0f, false, false, -3f, -3f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(6f, 12f)
                horizontalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(6f, 8f)
                horizontalLineToRelative(2f)
            }
}

public val LucideIcons.All.BookOpenTextDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BookOpenText: ImageVector
    @Composable get() = BookOpenTextDefinition.asImageVector()
