package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ChartSpline") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3f, 3f)
                verticalLineToRelative(16f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(16f)
            }
            lucidePath(strokeWidth) {
                moveTo(7f, 16f)
                curveToRelative(.5f, -2f, 1.5f, -7f, 4f, -7f)
                curveToRelative(2f, 0f, 2f, 3f, 4f, 3f)
                curveToRelative(2.5f, 0f, 4.5f, -5f, 5f, -7f)
            }
}

public val LucideIcons.All.ChartSplineDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ChartSpline: ImageVector
    @Composable get() = ChartSplineDefinition.asImageVector()
