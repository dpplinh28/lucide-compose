package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Telescope") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(10.065f, 12.493f)
                lineToRelative(-6.18f, 1.318f)
                arcToRelative(.934f, .934f, 0f, false, true, -1.108f, -.702f)
                lineToRelative(-.537f, -2.15f)
                arcToRelative(1.07f, 1.07f, 0f, false, true, .691f, -1.265f)
                lineToRelative(13.504f, -4.44f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(13.56f, 11.747f)
                lineToRelative(4.332f, -.924f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(16f, 21f)
                lineToRelative(-3.105f, -6.21f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.485f, 5.94f)
                arcToRelative(2f, 2f, 0f, false, true, 1.455f, -2.425f)
                lineToRelative(1.09f, -.272f)
                arcToRelative(1f, 1f, 0f, false, true, 1.212f, .727f)
                lineToRelative(1.515f, 6.06f)
                arcToRelative(1f, 1f, 0f, false, true, -.727f, 1.213f)
                lineToRelative(-1.09f, .272f)
                arcToRelative(2f, 2f, 0f, false, true, -2.425f, -1.455f)
                close()
            }
            lucidePath(strokeWidth) {
                moveToRelative(6.158f, 8.633f)
                lineToRelative(1.114f, 4.456f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(8f, 21f)
                lineToRelative(3.105f, -6.21f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f, 13.0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, 4.0f, 0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, -4.0f, 0f)
            }
}

public val LucideIcons.All.TelescopeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Telescope: ImageVector
    @Composable get() = TelescopeDefinition.asImageVector()
