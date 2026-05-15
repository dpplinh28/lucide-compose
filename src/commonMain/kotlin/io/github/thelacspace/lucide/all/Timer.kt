package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Timer") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10f, 2f)
                lineTo(14f, 2f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 14f)
                lineTo(15f, 11f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f, 14.0f)
                arcToRelative(8.0f, 8.0f, 0f, true, false, 16.0f, 0f)
                arcToRelative(8.0f, 8.0f, 0f, true, false, -16.0f, 0f)
            }
}

public val LucideIcons.All.TimerDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Timer: ImageVector
    @Composable get() = TimerDefinition.asImageVector()
