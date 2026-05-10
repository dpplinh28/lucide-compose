package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("LandPlot") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(12f, 8f)
                lineToRelative(6f, -3f)
                lineToRelative(-6f, -3f)
                verticalLineToRelative(10f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(8f, 11.99f)
                lineToRelative(-5.5f, 3.14f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, 1.74f)
                lineToRelative(8.5f, 4.86f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 0f)
                lineToRelative(8.5f, -4.86f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -1.74f)
                lineTo(16f, 12f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(6.49f, 12.85f)
                lineToRelative(11.02f, 6.3f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.51f, 12.85f)
                lineTo(6.5f, 19.15f)
            }
}

public val LucideIcons.All.LandPlotDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.LandPlot: ImageVector
    @Composable get() = LandPlotDefinition.asImageVector()
