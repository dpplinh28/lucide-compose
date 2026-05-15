package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Cake") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(20f, 21f)
                verticalLineToRelative(-8f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                horizontalLineTo(6f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(8f)
            }
            lucidePath(strokeWidth) {
                moveTo(4f, 16f)
                reflectiveCurveToRelative(.5f, -1f, 2f, -1f)
                reflectiveCurveToRelative(2.5f, 2f, 4f, 2f)
                reflectiveCurveToRelative(2.5f, -2f, 4f, -2f)
                reflectiveCurveToRelative(2.5f, 2f, 4f, 2f)
                reflectiveCurveToRelative(2f, -1f, 2f, -1f)
            }
            lucidePath(strokeWidth) {
                moveTo(2f, 21f)
                horizontalLineToRelative(20f)
            }
            lucidePath(strokeWidth) {
                moveTo(7f, 8f)
                verticalLineToRelative(3f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 8f)
                verticalLineToRelative(3f)
            }
            lucidePath(strokeWidth) {
                moveTo(17f, 8f)
                verticalLineToRelative(3f)
            }
            lucidePath(strokeWidth) {
                moveTo(7f, 4f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 4f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(17f, 4f)
                horizontalLineToRelative(.01f)
            }
}

public val LucideIcons.All.CakeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Cake: ImageVector
    @Composable get() = CakeDefinition.asImageVector()
