package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Joystick") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(21f, 17f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                horizontalLineTo(5f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(2f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(14f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineToRelative(-2f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(6f, 15f)
                verticalLineToRelative(-2f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 15f)
                verticalLineTo(9f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f, 6.0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, 6.0f, 0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, -6.0f, 0f)
            }
}

public val LucideIcons.All.JoystickDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Joystick: ImageVector
    @Composable get() = JoystickDefinition.asImageVector()
