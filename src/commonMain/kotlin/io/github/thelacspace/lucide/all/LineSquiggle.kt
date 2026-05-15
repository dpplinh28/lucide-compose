package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("LineSquiggle") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(7f, 3.5f)
                curveToRelative(5f, -2f, 7f, 2.5f, 3f, 4f)
                curveTo(1.5f, 10f, 2f, 15f, 5f, 16f)
                curveToRelative(5f, 2f, 9f, -10f, 14f, -7f)
                reflectiveCurveToRelative(.5f, 13.5f, -4f, 12f)
                curveToRelative(-5f, -2.5f, .5f, -11f, 6f, -2f)
            }
}

public val LucideIcons.All.LineSquiggleDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.LineSquiggle: ImageVector
    @Composable get() = LineSquiggleDefinition.asImageVector()
