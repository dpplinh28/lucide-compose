package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("TrafficCone") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16.05f, 10.966f)
                arcToRelative(5f, 2.5f, 0f, false, true, -8.1f, 0f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(16.923f, 14.049f)
                lineToRelative(4.48f, 2.04f)
                arcToRelative(1f, 1f, 0f, false, true, .001f, 1.831f)
                lineToRelative(-8.574f, 3.9f)
                arcToRelative(2f, 2f, 0f, false, true, -1.66f, 0f)
                lineToRelative(-8.574f, -3.91f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, -1.83f)
                lineToRelative(4.484f, -2.04f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.949f, 14.14f)
                arcToRelative(5f, 2.5f, 0f, true, true, -9.9f, 0f)
                lineTo(10.063f, 3.5f)
                arcToRelative(2f, 2f, 0f, false, true, 3.874f, 0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(9.194f, 6.57f)
                arcToRelative(5f, 2.5f, 0f, false, false, 5.61f, 0f)
            }
}

public val LucideIcons.All.TrafficConeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.TrafficCone: ImageVector
    @Composable get() = TrafficConeDefinition.asImageVector()
