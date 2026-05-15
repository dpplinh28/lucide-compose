package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("WashingMachine") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3f, 6f)
                horizontalLineToRelative(3f)
            }
            lucidePath(strokeWidth) {
                moveTo(17f, 6f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f, 2.0f)
                horizontalLineToRelative(14.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, 2.0f, 0.0f)
                verticalLineToRelative(20.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, -2.0f, 0.0f)
                horizontalLineToRelative(-14.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, -2.0f, -0.0f)
                verticalLineToRelative(-20.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, 2.0f, -0.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f, 13.0f)
                arcToRelative(5.0f, 5.0f, 0f, true, false, 10.0f, 0f)
                arcToRelative(5.0f, 5.0f, 0f, true, false, -10.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 18f)
                arcToRelative(2.5f, 2.5f, 0f, false, false, 0f, -5f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, 0f, -5f)
            }
}

public val LucideIcons.All.WashingMachineDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.WashingMachine: ImageVector
    @Composable get() = WashingMachineDefinition.asImageVector()
