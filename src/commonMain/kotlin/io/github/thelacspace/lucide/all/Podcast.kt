package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Podcast") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(13f, 17f)
                arcToRelative(1f, 1f, 0f, true, false, -2f, 0f)
                lineToRelative(.5f, 4.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 1f, 0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(16.85f, 18.58f)
                arcToRelative(9f, 9f, 0f, true, false, -9.7f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 14f)
                arcToRelative(5f, 5f, 0f, true, true, 8f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(11.0f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0f, true, false, 2.0f, 0f)
                arcToRelative(1.0f, 1.0f, 0f, true, false, -2.0f, 0f)
            }
}

public val LucideIcons.All.PodcastDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Podcast: ImageVector
    @Composable get() = PodcastDefinition.asImageVector()
