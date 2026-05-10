package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("PlaneTakeoff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2f, 22f)
                horizontalLineToRelative(20f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.36f, 17.4f)
                lineTo(4f, 17f)
                lineToRelative(-2f, -4f)
                lineToRelative(1.1f, -.55f)
                arcToRelative(2f, 2f, 0f, false, true, 1.8f, 0f)
                lineToRelative(.17f, .1f)
                arcToRelative(2f, 2f, 0f, false, false, 1.8f, 0f)
                lineTo(8f, 12f)
                lineTo(5f, 6f)
                lineToRelative(.9f, -.45f)
                arcToRelative(2f, 2f, 0f, false, true, 2.09f, .2f)
                lineToRelative(4.02f, 3f)
                arcToRelative(2f, 2f, 0f, false, false, 2.1f, .2f)
                lineToRelative(4.19f, -2.06f)
                arcToRelative(2.41f, 2.41f, 0f, false, true, 1.73f, -.17f)
                lineTo(21f, 7f)
                arcToRelative(1.4f, 1.4f, 0f, false, true, .87f, 1.99f)
                lineToRelative(-.38f, .76f)
                curveToRelative(-.23f, .46f, -.6f, .84f, -1.07f, 1.08f)
                lineTo(7.58f, 17.2f)
                arcToRelative(2f, 2f, 0f, false, true, -1.22f, .18f)
                close()
            }
}

public val LucideIcons.All.PlaneTakeoffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.PlaneTakeoff: ImageVector
    @Composable get() = PlaneTakeoffDefinition.asImageVector()
