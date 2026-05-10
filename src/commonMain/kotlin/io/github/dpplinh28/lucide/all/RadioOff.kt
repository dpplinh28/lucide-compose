package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("RadioOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(13.414f, 13.414f)
                arcToRelative(2f, 2f, 0f, true, true, -2.828f, -2.828f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.247f, 7.761f)
                arcToRelative(6f, 6f, 0f, false, true, 1.744f, 4.572f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.075f, 4.933f)
                arcToRelative(10f, 10f, 0f, false, true, 2.234f, 10.72f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(2f, 2f)
                lineToRelative(20f, 20f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.925f, 19.067f)
                arcToRelative(10f, 10f, 0f, false, true, 0f, -14.134f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.753f, 16.239f)
                arcToRelative(6f, 6f, 0f, false, true, 0f, -8.478f)
            }
}

public val LucideIcons.All.RadioOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.RadioOff: ImageVector
    @Composable get() = RadioOffDefinition.asImageVector()
