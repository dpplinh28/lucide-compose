package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Highlighter") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(9f, 11f)
                lineToRelative(-6f, 6f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(9f)
                lineToRelative(3f, -3f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(22f, 12f)
                lineToRelative(-4.6f, 4.6f)
                arcToRelative(2f, 2f, 0f, false, true, -2.8f, 0f)
                lineToRelative(-5.2f, -5.2f)
                arcToRelative(2f, 2f, 0f, false, true, 0f, -2.8f)
                lineTo(14f, 4f)
            }
}

public val LucideIcons.All.HighlighterDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Highlighter: ImageVector
    @Composable get() = HighlighterDefinition.asImageVector()
