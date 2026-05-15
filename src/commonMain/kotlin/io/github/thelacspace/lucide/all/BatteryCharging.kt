package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BatteryCharging") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(11f, 7f)
                lineToRelative(-3f, 5f)
                horizontalLineToRelative(4f)
                lineToRelative(-3f, 5f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.856f, 6f)
                horizontalLineTo(16f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(8f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineToRelative(-2.935f)
            }
            lucidePath(strokeWidth) {
                moveTo(22f, 14f)
                verticalLineToRelative(-4f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.14f, 18f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineTo(8f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(2.936f)
            }
}

public val LucideIcons.All.BatteryChargingDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BatteryCharging: ImageVector
    @Composable get() = BatteryChargingDefinition.asImageVector()
