package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("TextCursor") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(17f, 22f)
                horizontalLineToRelative(-1f)
                arcToRelative(4f, 4f, 0f, false, true, -4f, -4f)
                verticalLineTo(6f)
                arcToRelative(4f, 4f, 0f, false, true, 4f, -4f)
                horizontalLineToRelative(1f)
            }
            lucidePath(strokeWidth) {
                moveTo(7f, 22f)
                horizontalLineToRelative(1f)
                arcToRelative(4f, 4f, 0f, false, false, 4f, -4f)
            }
            lucidePath(strokeWidth) {
                moveTo(7f, 2f)
                horizontalLineToRelative(1f)
                arcToRelative(4f, 4f, 0f, false, true, 4f, 4f)
            }
}

public val LucideIcons.All.TextCursorDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.TextCursor: ImageVector
    @Composable get() = TextCursorDefinition.asImageVector()
