package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ChartGantt") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10f, 6f)
                horizontalLineToRelative(8f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 16f)
                horizontalLineToRelative(6f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 3f)
                verticalLineToRelative(16f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(16f)
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 11f)
                horizontalLineToRelative(7f)
            }
}

public val LucideIcons.All.ChartGanttDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ChartGantt: ImageVector
    @Composable get() = ChartGanttDefinition.asImageVector()
