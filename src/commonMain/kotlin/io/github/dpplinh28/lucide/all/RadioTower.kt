package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("RadioTower") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.9f, 16.1f)
                curveTo(1f, 12.2f, 1f, 5.8f, 4.9f, 1.9f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.8f, 4.7f)
                arcToRelative(6.14f, 6.14f, 0f, false, false, -.8f, 7.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f, 9.0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, 4.0f, 0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, -4.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.2f, 4.8f)
                curveToRelative(2f, 2f, 2.26f, 5.11f, .8f, 7.47f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.1f, 1.9f)
                arcToRelative(9.96f, 9.96f, 0f, false, true, 0f, 14.1f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.5f, 18f)
                horizontalLineToRelative(5f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(8f, 22f)
                lineToRelative(4f, -11f)
                lineToRelative(4f, 11f)
            }
}

public val LucideIcons.All.RadioTowerDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.RadioTower: ImageVector
    @Composable get() = RadioTowerDefinition.asImageVector()
