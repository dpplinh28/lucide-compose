package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("AlarmClockOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(6.87f, 6.87f)
                arcToRelative(8f, 8f, 0f, true, false, 11.26f, 11.26f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.9f, 14.25f)
                arcToRelative(8f, 8f, 0f, false, false, -9.15f, -9.15f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(22f, 6f)
                lineToRelative(-3f, -3f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.26f, 18.67f)
                lineTo(4f, 21f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(2f, 2f)
                lineToRelative(20f, 20f)
            }
            lucidePath(strokeWidth) {
                moveTo(4f, 4f)
                lineTo(2f, 6f)
            }
}

public val LucideIcons.All.AlarmClockOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.AlarmClockOff: ImageVector
    @Composable get() = AlarmClockOffDefinition.asImageVector()
