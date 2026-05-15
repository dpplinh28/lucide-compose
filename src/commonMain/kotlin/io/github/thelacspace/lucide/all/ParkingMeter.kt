package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ParkingMeter") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11f, 15f)
                horizontalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 12f)
                verticalLineToRelative(3f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 19f)
                verticalLineToRelative(3f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.282f, 19f)
                arcToRelative(1f, 1f, 0f, false, false, .948f, -.68f)
                lineToRelative(2.37f, -6.988f)
                arcToRelative(7f, 7f, 0f, true, false, -13.2f, 0f)
                lineToRelative(2.37f, 6.988f)
                arcToRelative(1f, 1f, 0f, false, false, .948f, .68f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 9f)
                arcToRelative(3f, 3f, 0f, true, true, 6f, 0f)
            }
}

public val LucideIcons.All.ParkingMeterDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ParkingMeter: ImageVector
    @Composable get() = ParkingMeterDefinition.asImageVector()
