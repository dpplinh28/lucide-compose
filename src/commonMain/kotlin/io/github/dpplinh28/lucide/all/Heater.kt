package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Heater") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11f, 8f)
                curveToRelative(2f, -3f, -2f, -3f, 0f, -6f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.5f, 8f)
                curveToRelative(2f, -3f, -2f, -3f, 0f, -6f)
            }
            lucidePath(strokeWidth) {
                moveTo(6f, 10f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(6f, 14f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(10f, 16f)
                verticalLineToRelative(-4f)
            }
            lucidePath(strokeWidth) {
                moveTo(14f, 16f)
                verticalLineToRelative(-4f)
            }
            lucidePath(strokeWidth) {
                moveTo(18f, 16f)
                verticalLineToRelative(-4f)
            }
            lucidePath(strokeWidth) {
                moveTo(20f, 6f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(10f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineTo(8f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(3f)
            }
            lucidePath(strokeWidth) {
                moveTo(5f, 20f)
                verticalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(19f, 20f)
                verticalLineToRelative(2f)
            }
}

public val LucideIcons.All.HeaterDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Heater: ImageVector
    @Composable get() = HeaterDefinition.asImageVector()
