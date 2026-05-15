package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Beer") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(17f, 11f)
                horizontalLineToRelative(1f)
                arcToRelative(3f, 3f, 0f, false, true, 0f, 6f)
                horizontalLineToRelative(-1f)
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 12f)
                verticalLineToRelative(6f)
            }
            lucidePath(strokeWidth) {
                moveTo(13f, 12f)
                verticalLineToRelative(6f)
            }
            lucidePath(strokeWidth) {
                moveTo(14f, 7.5f)
                curveToRelative(-1f, 0f, -1.44f, .5f, -3f, .5f)
                reflectiveCurveToRelative(-2f, -.5f, -3f, -.5f)
                reflectiveCurveToRelative(-1.72f, .5f, -2.5f, .5f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, 0f, -5f)
                curveToRelative(.78f, 0f, 1.57f, .5f, 2.5f, .5f)
                reflectiveCurveTo(9.44f, 2f, 11f, 2f)
                reflectiveCurveToRelative(2f, 1.5f, 3f, 1.5f)
                reflectiveCurveToRelative(1.72f, -.5f, 2.5f, -.5f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, 0f, 5f)
                curveToRelative(-.78f, 0f, -1.5f, -.5f, -2.5f, -.5f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(5f, 8f)
                verticalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(8f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineTo(8f)
            }
}

public val LucideIcons.All.BeerDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Beer: ImageVector
    @Composable get() = BeerDefinition.asImageVector()
