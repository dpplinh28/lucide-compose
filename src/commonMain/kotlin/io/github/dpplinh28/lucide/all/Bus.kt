package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Bus") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(8f, 6f)
                verticalLineToRelative(6f)
            }
            lucidePath(strokeWidth) {
                moveTo(15f, 6f)
                verticalLineToRelative(6f)
            }
            lucidePath(strokeWidth) {
                moveTo(2f, 12f)
                horizontalLineToRelative(19.6f)
            }
            lucidePath(strokeWidth) {
                moveTo(18f, 18f)
                horizontalLineToRelative(3f)
                reflectiveCurveToRelative(.5f, -1.7f, .8f, -2.8f)
                curveToRelative(.1f, -.4f, .2f, -.8f, .2f, -1.2f)
                curveToRelative(0f, -.4f, -.1f, -.8f, -.2f, -1.2f)
                lineToRelative(-1.4f, -5f)
                curveTo(20.1f, 6.8f, 19.1f, 6f, 18f, 6f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(3f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f, 18.0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, 4.0f, 0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, -4.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 18f)
                horizontalLineToRelative(5f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f, 18.0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, 4.0f, 0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, -4.0f, 0f)
            }
}

public val LucideIcons.All.BusDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Bus: ImageVector
    @Composable get() = BusDefinition.asImageVector()
