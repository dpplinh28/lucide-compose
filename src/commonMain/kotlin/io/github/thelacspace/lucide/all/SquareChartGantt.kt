package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SquareChartGantt") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(5.0f, 3.0f)
                horizontalLineToRelative(14.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, 2.0f, 0.0f)
                verticalLineToRelative(18.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, -2.0f, 0.0f)
                horizontalLineToRelative(-14.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, -2.0f, -0.0f)
                verticalLineToRelative(-18.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, 2.0f, -0.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 8f)
                horizontalLineToRelative(7f)
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 12f)
                horizontalLineToRelative(6f)
            }
            lucidePath(strokeWidth) {
                moveTo(11f, 16f)
                horizontalLineToRelative(5f)
            }
}

public val LucideIcons.All.SquareChartGanttDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SquareChartGantt: ImageVector
    @Composable get() = SquareChartGanttDefinition.asImageVector()
