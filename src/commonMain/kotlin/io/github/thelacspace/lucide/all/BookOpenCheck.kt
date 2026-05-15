package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BookOpenCheck") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 21f)
                verticalLineTo(7f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(16f, 12f)
                lineToRelative(2f, 2f)
                lineToRelative(4f, -4f)
            }
            lucidePath(strokeWidth) {
                moveTo(22f, 6f)
                verticalLineTo(4f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                horizontalLineToRelative(-5f)
                arcToRelative(4f, 4f, 0f, false, false, -4f, 4f)
                arcToRelative(4f, 4f, 0f, false, false, -4f, -4f)
                horizontalLineTo(3f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(13f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(6f)
                arcToRelative(3f, 3f, 0f, false, true, 3f, 3f)
                arcToRelative(3f, 3f, 0f, false, true, 3f, -3f)
                horizontalLineToRelative(6f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                verticalLineToRelative(-1.3f)
            }
}

public val LucideIcons.All.BookOpenCheckDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BookOpenCheck: ImageVector
    @Composable get() = BookOpenCheckDefinition.asImageVector()
