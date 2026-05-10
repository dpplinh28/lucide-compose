package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BeerOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(13f, 13f)
                verticalLineToRelative(5f)
            }
            lucidePath(strokeWidth) {
                moveTo(17f, 11.47f)
                verticalLineTo(8f)
            }
            lucidePath(strokeWidth) {
                moveTo(17f, 11f)
                horizontalLineToRelative(1f)
                arcToRelative(3f, 3f, 0f, false, true, 2.745f, 4.211f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(2f, 2f)
                lineToRelative(20f, 20f)
            }
            lucidePath(strokeWidth) {
                moveTo(5f, 8f)
                verticalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(8f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineToRelative(-3f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.536f, 7.535f)
                curveTo(6.766f, 7.649f, 6.154f, 8f, 5.5f, 8f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, -1.768f, -4.268f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.727f, 3.204f)
                curveTo(9.306f, 2.767f, 9.885f, 2f, 11f, 2f)
                curveToRelative(1.56f, 0f, 2f, 1.5f, 3f, 1.5f)
                reflectiveCurveToRelative(1.72f, -.5f, 2.5f, -.5f)
                arcToRelative(1f, 1f, 0f, true, true, 0f, 5f)
                curveToRelative(-.78f, 0f, -1.5f, -.5f, -2.5f, -.5f)
                arcToRelative(3.149f, 3.149f, 0f, false, false, -.842f, .12f)
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 14.6f)
                verticalLineTo(18f)
            }
}

public val LucideIcons.All.BeerOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BeerOff: ImageVector
    @Composable get() = BeerOffDefinition.asImageVector()
