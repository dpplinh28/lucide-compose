package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("TimerOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10f, 2f)
                horizontalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.6f, 11f)
                arcToRelative(8f, 8f, 0f, false, false, 1.7f, 8.7f)
                arcToRelative(8f, 8f, 0f, false, false, 8.7f, 1.7f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.4f, 7.4f)
                arcToRelative(8f, 8f, 0f, false, true, 10.3f, 1f)
                arcToRelative(8f, 8f, 0f, false, true, .9f, 10.2f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(2f, 2f)
                lineToRelative(20f, 20f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 12f)
                verticalLineToRelative(-2f)
            }
}

public val LucideIcons.All.TimerOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.TimerOff: ImageVector
    @Composable get() = TimerOffDefinition.asImageVector()
