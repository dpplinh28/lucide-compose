package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Ham") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(13.144f, 21.144f)
                arcTo(7.274f, 10.445f, 45f, true, false, 2.856f, 10.856f)
            }
            lucidePath(strokeWidth) {
                moveTo(13.144f, 21.144f)
                arcTo(7.274f, 4.365f, 45f, false, false, 2.856f, 10.856f)
                arcToRelative(7.274f, 4.365f, 45f, false, false, 10.288f, 10.288f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.565f, 10.435f)
                lineTo(18.6f, 8.4f)
                arcToRelative(2.501f, 2.501f, 0f, true, false, 1.65f, -4.65f)
                arcToRelative(2.5f, 2.5f, 0f, true, false, -4.66f, 1.66f)
                lineToRelative(-2.024f, 2.025f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(8.5f, 16.5f)
                lineToRelative(-1f, -1f)
            }
}

public val LucideIcons.All.HamDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Ham: ImageVector
    @Composable get() = HamDefinition.asImageVector()
