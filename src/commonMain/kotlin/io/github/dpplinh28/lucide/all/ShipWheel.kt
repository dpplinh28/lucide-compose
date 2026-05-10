package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ShipWheel") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.0f, 12.0f)
                arcToRelative(8.0f, 8.0f, 0f, true, false, 16.0f, 0f)
                arcToRelative(8.0f, 8.0f, 0f, true, false, -16.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 2f)
                verticalLineToRelative(7.5f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(19f, 5f)
                lineToRelative(-5.23f, 5.23f)
            }
            lucidePath(strokeWidth) {
                moveTo(22f, 12f)
                horizontalLineToRelative(-7.5f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(19f, 19f)
                lineToRelative(-5.23f, -5.23f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 14.5f)
                verticalLineTo(22f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.23f, 13.77f)
                lineTo(5f, 19f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.5f, 12f)
                horizontalLineTo(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.23f, 10.23f)
                lineTo(5f, 5f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.5f, 12.0f)
                arcToRelative(2.5f, 2.5f, 0f, true, false, 5.0f, 0f)
                arcToRelative(2.5f, 2.5f, 0f, true, false, -5.0f, 0f)
            }
}

public val LucideIcons.All.ShipWheelDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ShipWheel: ImageVector
    @Composable get() = ShipWheelDefinition.asImageVector()
