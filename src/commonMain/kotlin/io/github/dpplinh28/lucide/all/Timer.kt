package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

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
