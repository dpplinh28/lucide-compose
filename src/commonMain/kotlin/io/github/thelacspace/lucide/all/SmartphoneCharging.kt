package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SmartphoneCharging") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(7.0f, 2.0f)
                horizontalLineToRelative(10.0f)
                arcToRelative(2.0f, 2.0f, 0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(2.0f, 2.0f, 0f, false, true, -2.0f, 2.0f)
                horizontalLineToRelative(-10.0f)
                arcToRelative(2.0f, 2.0f, 0f, false, true, -2.0f, -2.0f)
                verticalLineToRelative(-16.0f)
                arcToRelative(2.0f, 2.0f, 0f, false, true, 2.0f, -2.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(12.667f, 8f)
                lineTo(10f, 12f)
                horizontalLineToRelative(4f)
                lineToRelative(-2.667f, 4f)
            }
}

public val LucideIcons.All.SmartphoneChargingDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SmartphoneCharging: ImageVector
    @Composable get() = SmartphoneChargingDefinition.asImageVector()
