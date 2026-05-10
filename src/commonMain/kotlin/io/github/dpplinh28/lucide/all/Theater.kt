package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Theater") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2f, 10f)
                reflectiveCurveToRelative(3f, -3f, 3f, -8f)
            }
            lucidePath(strokeWidth) {
                moveTo(22f, 10f)
                reflectiveCurveToRelative(-3f, -3f, -3f, -8f)
            }
            lucidePath(strokeWidth) {
                moveTo(10f, 2f)
                curveToRelative(0f, 4.4f, -3.6f, 8f, -8f, 8f)
            }
            lucidePath(strokeWidth) {
                moveTo(14f, 2f)
                curveToRelative(0f, 4.4f, 3.6f, 8f, 8f, 8f)
            }
            lucidePath(strokeWidth) {
                moveTo(2f, 10f)
                reflectiveCurveToRelative(2f, 2f, 2f, 5f)
            }
            lucidePath(strokeWidth) {
                moveTo(22f, 10f)
                reflectiveCurveToRelative(-2f, 2f, -2f, 5f)
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 15f)
                horizontalLineToRelative(8f)
            }
            lucidePath(strokeWidth) {
                moveTo(2f, 22f)
                verticalLineToRelative(-1f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(4f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(1f)
            }
            lucidePath(strokeWidth) {
                moveTo(14f, 22f)
                verticalLineToRelative(-1f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(4f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(1f)
            }
}

public val LucideIcons.All.TheaterDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Theater: ImageVector
    @Composable get() = TheaterDefinition.asImageVector()
