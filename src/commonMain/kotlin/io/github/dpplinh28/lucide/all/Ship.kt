package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Ship") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 10.189f)
                verticalLineTo(14f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 2f)
                verticalLineToRelative(3f)
            }
            lucidePath(strokeWidth) {
                moveTo(19f, 13f)
                verticalLineTo(7f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                horizontalLineTo(7f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(6f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.38f, 20f)
                arcTo(11.6f, 11.6f, 0f, false, false, 21f, 14f)
                lineToRelative(-8.188f, -3.639f)
                arcToRelative(2f, 2f, 0f, false, false, -1.624f, 0f)
                lineTo(3f, 14f)
                arcToRelative(11.6f, 11.6f, 0f, false, false, 2.81f, 7.76f)
            }
            lucidePath(strokeWidth) {
                moveTo(2f, 21f)
                curveToRelative(.6f, .5f, 1.2f, 1f, 2.5f, 1f)
                curveToRelative(2.5f, 0f, 2.5f, -2f, 5f, -2f)
                curveToRelative(1.3f, 0f, 1.9f, .5f, 2.5f, 1f)
                reflectiveCurveToRelative(1.2f, 1f, 2.5f, 1f)
                curveToRelative(2.5f, 0f, 2.5f, -2f, 5f, -2f)
                curveToRelative(1.3f, 0f, 1.9f, .5f, 2.5f, 1f)
            }
}

public val LucideIcons.All.ShipDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Ship: ImageVector
    @Composable get() = ShipDefinition.asImageVector()
