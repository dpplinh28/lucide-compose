package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ChartNoAxesGantt") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(6f, 5f)
                horizontalLineToRelative(12f)
            }
            lucidePath(strokeWidth) {
                moveTo(4f, 12f)
                horizontalLineToRelative(10f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 19f)
                horizontalLineToRelative(8f)
            }
}

public val LucideIcons.All.ChartNoAxesGanttDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ChartNoAxesGantt: ImageVector
    @Composable get() = ChartNoAxesGanttDefinition.asImageVector()
