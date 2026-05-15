package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("EggFried") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(8.0f, 12.5f)
                arcToRelative(3.5f, 3.5f, 0f, true, false, 7.0f, 0f)
                arcToRelative(3.5f, 3.5f, 0f, true, false, -7.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 8f)
                curveToRelative(0f, -3.5f, 2.5f, -6f, 6.5f, -6f)
                curveToRelative(5f, 0f, 4.83f, 3f, 7.5f, 5f)
                reflectiveCurveToRelative(5f, 2f, 5f, 6f)
                curveToRelative(0f, 4.5f, -2.5f, 6.5f, -7f, 6.5f)
                curveToRelative(-2.5f, 0f, -2.5f, 2.5f, -6f, 2.5f)
                reflectiveCurveToRelative(-7f, -2f, -7f, -5.5f)
                curveToRelative(0f, -3f, 1.5f, -3f, 1.5f, -5f)
                curveTo(3.5f, 10f, 3f, 9f, 3f, 8f)
                close()
            }
}

public val LucideIcons.All.EggFriedDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.EggFried: ImageVector
    @Composable get() = EggFriedDefinition.asImageVector()
