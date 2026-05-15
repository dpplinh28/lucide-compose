package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Gamepad") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(6f, 12f)
                lineTo(10f, 12f)
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 10f)
                lineTo(8f, 14f)
            }
            lucidePath(strokeWidth) {
                moveTo(15f, 13f)
                lineTo(15.01f, 13f)
            }
            lucidePath(strokeWidth) {
                moveTo(18f, 11f)
                lineTo(18.01f, 11f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f, 6.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, 2.0f, 0.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, -2.0f, 0.0f)
                horizontalLineToRelative(-16.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, -2.0f, -0.0f)
                verticalLineToRelative(-12.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, 2.0f, -0.0f)
                close()
            }
}

public val LucideIcons.All.GamepadDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Gamepad: ImageVector
    @Composable get() = GamepadDefinition.asImageVector()
