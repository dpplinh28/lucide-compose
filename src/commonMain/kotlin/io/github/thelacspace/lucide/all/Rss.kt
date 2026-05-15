package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Rss") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4f, 11f)
                arcToRelative(9f, 9f, 0f, false, true, 9f, 9f)
            }
            lucidePath(strokeWidth) {
                moveTo(4f, 4f)
                arcToRelative(16f, 16f, 0f, false, true, 16f, 16f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f, 19.0f)
                arcToRelative(1.0f, 1.0f, 0f, true, false, 2.0f, 0f)
                arcToRelative(1.0f, 1.0f, 0f, true, false, -2.0f, 0f)
            }
}

public val LucideIcons.All.RssDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Rss: ImageVector
    @Composable get() = RssDefinition.asImageVector()
