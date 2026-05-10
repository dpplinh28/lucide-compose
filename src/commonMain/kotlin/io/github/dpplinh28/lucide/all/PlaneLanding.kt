package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("PlaneLanding") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2f, 22f)
                horizontalLineToRelative(20f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.77f, 10.77f)
                lineTo(2f, 9f)
                lineToRelative(2f, -4.5f)
                lineToRelative(1.1f, .55f)
                curveToRelative(.55f, .28f, .9f, .84f, .9f, 1.45f)
                reflectiveCurveToRelative(.35f, 1.17f, .9f, 1.45f)
                lineTo(8f, 8.5f)
                lineToRelative(3f, -6f)
                lineToRelative(1.05f, .53f)
                arcToRelative(2f, 2f, 0f, false, true, 1.09f, 1.52f)
                lineToRelative(.72f, 5.4f)
                arcToRelative(2f, 2f, 0f, false, false, 1.09f, 1.52f)
                lineToRelative(4.4f, 2.2f)
                curveToRelative(.42f, .22f, .78f, .55f, 1.01f, .96f)
                lineToRelative(.6f, 1.03f)
                curveToRelative(.49f, .88f, -.06f, 1.98f, -1.06f, 2.1f)
                lineToRelative(-1.18f, .15f)
                curveToRelative(-.47f, .06f, -.95f, -.02f, -1.37f, -.24f)
                lineTo(4.29f, 11.15f)
                arcToRelative(2f, 2f, 0f, false, true, -.52f, -.38f)
                close()
            }
}

public val LucideIcons.All.PlaneLandingDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.PlaneLanding: ImageVector
    @Composable get() = PlaneLandingDefinition.asImageVector()
