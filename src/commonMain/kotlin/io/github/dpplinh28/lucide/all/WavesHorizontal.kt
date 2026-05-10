package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("WavesHorizontal") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2f, 12f)
                quadToRelative(2.5f, 2f, 5f, 0f)
                reflectiveQuadToRelative(5f, 0f)
                reflectiveQuadToRelative(5f, 0f)
                reflectiveQuadToRelative(5f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2f, 19f)
                quadToRelative(2.5f, 2f, 5f, 0f)
                reflectiveQuadToRelative(5f, 0f)
                reflectiveQuadToRelative(5f, 0f)
                reflectiveQuadToRelative(5f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2f, 5f)
                quadToRelative(2.5f, 2f, 5f, 0f)
                reflectiveQuadToRelative(5f, 0f)
                reflectiveQuadToRelative(5f, 0f)
                reflectiveQuadToRelative(5f, 0f)
            }
}

public val LucideIcons.All.WavesHorizontalDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.WavesHorizontal: ImageVector
    @Composable get() = WavesHorizontalDefinition.asImageVector()
