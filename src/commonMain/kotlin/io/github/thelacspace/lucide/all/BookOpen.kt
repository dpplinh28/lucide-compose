package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BookOpen") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 7f)
                verticalLineToRelative(14f)
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
}

public val LucideIcons.All.BookOpenDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BookOpen: ImageVector
    @Composable get() = BookOpenDefinition.asImageVector()
