package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Car") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(19f, 17f)
                horizontalLineToRelative(2f)
                curveToRelative(.6f, 0f, 1f, -.4f, 1f, -1f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -.9f, -.7f, -1.7f, -1.5f, -1.9f)
                curveTo(18.7f, 10.6f, 16f, 10f, 16f, 10f)
                reflectiveCurveToRelative(-1.3f, -1.4f, -2.2f, -2.3f)
                curveToRelative(-.5f, -.4f, -1.1f, -.7f, -1.8f, -.7f)
                horizontalLineTo(5f)
                curveToRelative(-.6f, 0f, -1.1f, .4f, -1.4f, .9f)
                lineToRelative(-1.4f, 2.9f)
                arcTo(3.7f, 3.7f, 0f, false, false, 2f, 12f)
                verticalLineToRelative(4f)
                curveToRelative(0f, .6f, .4f, 1f, 1f, 1f)
                horizontalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f, 17.0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, 4.0f, 0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, -4.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 17f)
                horizontalLineToRelative(6f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f, 17.0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, 4.0f, 0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, -4.0f, 0f)
            }
}

public val LucideIcons.All.CarDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Car: ImageVector
    @Composable get() = CarDefinition.asImageVector()
