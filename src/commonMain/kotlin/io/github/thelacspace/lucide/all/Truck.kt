package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Truck") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14f, 18f)
                verticalLineTo(6f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(11f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(15f, 18f)
                horizontalLineTo(9f)
            }
            lucidePath(strokeWidth) {
                moveTo(19f, 18f)
                horizontalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                verticalLineToRelative(-3.65f)
                arcToRelative(1f, 1f, 0f, false, false, -.22f, -.624f)
                lineToRelative(-3.48f, -4.35f)
                arcTo(1f, 1f, 0f, false, false, 17.52f, 8f)
                horizontalLineTo(14f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f, 18.0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, 4.0f, 0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, -4.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f, 18.0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, 4.0f, 0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, -4.0f, 0f)
            }
}

public val LucideIcons.All.TruckDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Truck: ImageVector
    @Composable get() = TruckDefinition.asImageVector()
