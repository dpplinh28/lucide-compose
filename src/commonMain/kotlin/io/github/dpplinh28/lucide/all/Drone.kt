package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Drone") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10f, 10f)
                lineTo(7f, 7f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(10f, 14f)
                lineToRelative(-3f, 3f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(14f, 10f)
                lineToRelative(3f, -3f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(14f, 14f)
                lineToRelative(3f, 3f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.205f, 4.139f)
                arcToRelative(4f, 4f, 0f, true, true, 5.439f, 5.863f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.637f, 14f)
                arcToRelative(4f, 4f, 0f, true, true, -5.432f, 5.868f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.367f, 10f)
                arcToRelative(4f, 4f, 0f, true, true, 5.438f, -5.862f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.795f, 19.862f)
                arcToRelative(4f, 4f, 0f, true, true, -5.429f, -5.873f)
            }
            lucidePath(strokeWidth) {
                moveTo(11.0f, 8.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(1.0f, 0.0f, 0f, false, true, 1.0f, 0.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(1.0f, 0.0f, 0f, false, true, -1.0f, 0.0f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(1.0f, 0.0f, 0f, false, true, -1.0f, -0.0f)
                verticalLineToRelative(-8.0f)
                arcToRelative(1.0f, 0.0f, 0f, false, true, 1.0f, -0.0f)
                close()
            }
}

public val LucideIcons.All.DroneDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Drone: ImageVector
    @Composable get() = DroneDefinition.asImageVector()
