package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("WavesVertical") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 2f)
                quadToRelative(2f, 2.5f, 0f, 5f)
                reflectiveQuadToRelative(0f, 5f)
                reflectiveQuadToRelative(0f, 5f)
                reflectiveQuadToRelative(0f, 5f)
            }
            lucidePath(strokeWidth) {
                moveTo(19f, 2f)
                quadToRelative(2f, 2.5f, 0f, 5f)
                reflectiveQuadToRelative(0f, 5f)
                reflectiveQuadToRelative(0f, 5f)
                reflectiveQuadToRelative(0f, 5f)
            }
            lucidePath(strokeWidth) {
                moveTo(5f, 2f)
                quadToRelative(2f, 2.5f, 0f, 5f)
                reflectiveQuadToRelative(0f, 5f)
                reflectiveQuadToRelative(0f, 5f)
                reflectiveQuadToRelative(0f, 5f)
            }
}

public val LucideIcons.All.WavesVerticalDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.WavesVertical: ImageVector
    @Composable get() = WavesVerticalDefinition.asImageVector()
