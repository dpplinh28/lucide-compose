package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Drama") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10f, 11f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(14f, 6f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(18f, 6f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.5f, 13.1f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(22f, 5f)
                curveToRelative(0f, 9f, -4f, 12f, -6f, 12f)
                reflectiveCurveToRelative(-6f, -3f, -6f, -12f)
                curveToRelative(0f, -2f, 2f, -3f, 6f, -3f)
                reflectiveCurveToRelative(6f, 1f, 6f, 3f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.4f, 9.9f)
                curveToRelative(-.8f, .8f, -2f, .8f, -2.8f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.1f, 7.1f)
                curveTo(9f, 7.2f, 7.7f, 7.7f, 6f, 8.6f)
                curveToRelative(-3.5f, 2f, -4.7f, 3.9f, -3.7f, 5.6f)
                curveToRelative(4.5f, 7.8f, 9.5f, 8.4f, 11.2f, 7.4f)
                curveToRelative(.9f, -.5f, 1.9f, -2.1f, 1.9f, -4.7f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.1f, 16.5f)
                curveToRelative(.3f, -1.1f, 1.4f, -1.7f, 2.4f, -1.4f)
            }
}

public val LucideIcons.All.DramaDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Drama: ImageVector
    @Composable get() = DramaDefinition.asImageVector()
