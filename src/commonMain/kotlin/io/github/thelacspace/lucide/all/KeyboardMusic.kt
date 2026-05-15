package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("KeyboardMusic") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.0f, 4.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, 2.0f, 0.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, -2.0f, 0.0f)
                horizontalLineToRelative(-16.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, -2.0f, -0.0f)
                verticalLineToRelative(-16.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, 2.0f, -0.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(6f, 8f)
                horizontalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(14f, 8f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(18f, 8f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(2f, 12f)
                horizontalLineToRelative(20f)
            }
            lucidePath(strokeWidth) {
                moveTo(6f, 12f)
                verticalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(10f, 12f)
                verticalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(14f, 12f)
                verticalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(18f, 12f)
                verticalLineToRelative(4f)
            }
}

public val LucideIcons.All.KeyboardMusicDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.KeyboardMusic: ImageVector
    @Composable get() = KeyboardMusicDefinition.asImageVector()
