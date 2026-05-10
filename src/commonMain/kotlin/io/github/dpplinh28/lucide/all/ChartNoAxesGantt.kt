package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

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
