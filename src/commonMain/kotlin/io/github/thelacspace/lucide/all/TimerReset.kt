package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("TimerReset") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10f, 2f)
                horizontalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 14f)
                verticalLineToRelative(-4f)
            }
            lucidePath(strokeWidth) {
                moveTo(4f, 13f)
                arcToRelative(8f, 8f, 0f, false, true, 8f, -7f)
                arcToRelative(8f, 8f, 0f, true, true, -5.3f, 14f)
                lineTo(4f, 17.6f)
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 17f)
                horizontalLineTo(4f)
                verticalLineToRelative(5f)
            }
}

public val LucideIcons.All.TimerResetDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.TimerReset: ImageVector
    @Composable get() = TimerResetDefinition.asImageVector()
