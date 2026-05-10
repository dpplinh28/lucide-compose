package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Panda") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.25f, 17.25f)
                horizontalLineToRelative(1.5f)
                lineTo(12f, 18f)
                close()
            }
            lucidePath(strokeWidth) {
                moveToRelative(15f, 12f)
                lineToRelative(2f, 2f)
            }
            lucidePath(strokeWidth) {
                moveTo(18f, 6.5f)
                arcToRelative(.5f, .5f, 0f, false, false, -.5f, -.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.69f, 9.67f)
                arcToRelative(4.5f, 4.5f, 0f, true, false, -7.04f, -5.5f)
                arcToRelative(8.35f, 8.35f, 0f, false, false, -3.3f, 0f)
                arcToRelative(4.5f, 4.5f, 0f, true, false, -7.04f, 5.5f)
                curveTo(2.49f, 11.2f, 2f, 12.88f, 2f, 14.5f)
                curveTo(2f, 19.47f, 6.48f, 22f, 12f, 22f)
                reflectiveCurveToRelative(10f, -2.53f, 10f, -7.5f)
                curveToRelative(0f, -1.62f, -.48f, -3.3f, -1.3f, -4.83f)
            }
            lucidePath(strokeWidth) {
                moveTo(6f, 6.5f)
                arcToRelative(.495f, .495f, 0f, false, true, .5f, -.5f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(9f, 12f)
                lineToRelative(-2f, 2f)
            }
}

public val LucideIcons.All.PandaDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Panda: ImageVector
    @Composable get() = PandaDefinition.asImageVector()
