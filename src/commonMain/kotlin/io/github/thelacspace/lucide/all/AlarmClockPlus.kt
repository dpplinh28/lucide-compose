package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("AlarmClockPlus") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.0f, 13.0f)
                arcToRelative(8.0f, 8.0f, 0f, true, false, 16.0f, 0f)
                arcToRelative(8.0f, 8.0f, 0f, true, false, -16.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(5f, 3f)
                lineTo(2f, 6f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(22f, 6f)
                lineToRelative(-3f, -3f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.38f, 18.7f)
                lineTo(4f, 21f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.64f, 18.67f)
                lineTo(20f, 21f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 10f)
                verticalLineToRelative(6f)
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 13f)
                horizontalLineToRelative(6f)
            }
}

public val LucideIcons.All.AlarmClockPlusDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.AlarmClockPlus: ImageVector
    @Composable get() = AlarmClockPlusDefinition.asImageVector()
