package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("LassoSelect") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(7f, 22f)
                arcToRelative(5f, 5f, 0f, false, true, -2f, -4f)
            }
            lucidePath(strokeWidth) {
                moveTo(7f, 16.93f)
                curveToRelative(.96f, .43f, 1.96f, .74f, 2.99f, .91f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.34f, 14f)
                arcTo(6.8f, 6.8f, 0f, false, true, 2f, 10f)
                curveToRelative(0f, -4.42f, 4.48f, -8f, 10f, -8f)
                reflectiveCurveToRelative(10f, 3.58f, 10f, 8f)
                arcToRelative(7.19f, 7.19f, 0f, false, true, -.33f, 2f)
            }
            lucidePath(strokeWidth) {
                moveTo(5f, 18f)
                arcToRelative(2f, 2f, 0f, true, false, 0f, -4f)
                arcToRelative(2f, 2f, 0f, false, false, 0f, 4f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(14.33f, 22f)
                horizontalLineToRelative(-.09f)
                arcToRelative(.35f, .35f, 0f, false, true, -.24f, -.32f)
                verticalLineToRelative(-10f)
                arcToRelative(.34f, .34f, 0f, false, true, .33f, -.34f)
                curveToRelative(.08f, 0f, .15f, .03f, .21f, .08f)
                lineToRelative(7.34f, 6f)
                arcToRelative(.33f, .33f, 0f, false, true, -.21f, .59f)
                horizontalLineToRelative(-4.49f)
                lineToRelative(-2.57f, 3.85f)
                arcToRelative(.35f, .35f, 0f, false, true, -.28f, .14f)
                close()
            }
}

public val LucideIcons.All.LassoSelectDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.LassoSelect: ImageVector
    @Composable get() = LassoSelectDefinition.asImageVector()
