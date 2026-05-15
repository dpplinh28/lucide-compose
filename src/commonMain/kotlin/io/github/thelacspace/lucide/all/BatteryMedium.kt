package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BatteryMedium") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10f, 14f)
                verticalLineToRelative(-4f)
            }
            lucidePath(strokeWidth) {
                moveTo(22f, 14f)
                verticalLineToRelative(-4f)
            }
            lucidePath(strokeWidth) {
                moveTo(6f, 14f)
                verticalLineToRelative(-4f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f, 6.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, 2.0f, 0.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, -2.0f, 0.0f)
                horizontalLineToRelative(-12.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, -2.0f, -0.0f)
                verticalLineToRelative(-12.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, 2.0f, -0.0f)
                close()
            }
}

public val LucideIcons.All.BatteryMediumDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BatteryMedium: ImageVector
    @Composable get() = BatteryMediumDefinition.asImageVector()
