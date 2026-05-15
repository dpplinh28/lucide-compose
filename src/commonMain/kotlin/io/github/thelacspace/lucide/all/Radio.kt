package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Radio") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16.247f, 7.761f)
                arcToRelative(6f, 6f, 0f, false, true, 0f, 8.478f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.075f, 4.933f)
                arcToRelative(10f, 10f, 0f, false, true, 0f, 14.134f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.925f, 19.067f)
                arcToRelative(10f, 10f, 0f, false, true, 0f, -14.134f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.753f, 16.239f)
                arcToRelative(6f, 6f, 0f, false, true, 0f, -8.478f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f, 12.0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, 4.0f, 0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, -4.0f, 0f)
            }
}

public val LucideIcons.All.RadioDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Radio: ImageVector
    @Composable get() = RadioDefinition.asImageVector()
