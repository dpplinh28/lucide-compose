package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Motorbike") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(18f, 14f)
                lineToRelative(-1f, -3f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(3f, 9f)
                lineToRelative(6f, 2f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(2f)
                arcToRelative(2f, 2f, 0f, false, true, 1.99f, 1.81f)
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 17f)
                horizontalLineToRelative(3f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                arcToRelative(6f, 6f, 0f, false, true, 6f, -6f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                verticalLineToRelative(-.75f)
                arcTo(5f, 5f, 0f, false, false, 17f, 5f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f, 17.0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, 6.0f, 0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, -6.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f, 17.0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, 6.0f, 0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, -6.0f, 0f)
            }
}

public val LucideIcons.All.MotorbikeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Motorbike: ImageVector
    @Composable get() = MotorbikeDefinition.asImageVector()
