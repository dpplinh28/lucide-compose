package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Gauge") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(12f, 14f)
                lineToRelative(4f, -4f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.34f, 19f)
                arcToRelative(10f, 10f, 0f, true, true, 17.32f, 0f)
            }
}

public val LucideIcons.All.GaugeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Gauge: ImageVector
    @Composable get() = GaugeDefinition.asImageVector()
