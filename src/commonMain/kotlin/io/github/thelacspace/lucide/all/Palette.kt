package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Palette") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 22f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, -20f)
                arcToRelative(10f, 9f, 0f, false, true, 10f, 9f)
                arcToRelative(5f, 5f, 0f, false, true, -5f, 5f)
                horizontalLineToRelative(-2.25f)
                arcToRelative(1.75f, 1.75f, 0f, false, false, -1.4f, 2.8f)
                lineToRelative(.3f, .4f)
                arcToRelative(1.75f, 1.75f, 0f, false, true, -1.4f, 2.8f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(13.0f, 6.5f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, 1.0f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, -1.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0f, 10.5f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, 1.0f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, -1.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f, 12.5f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, 1.0f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, -1.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f, 7.5f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, 1.0f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, -1.0f, 0f)
            }
}

public val LucideIcons.All.PaletteDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Palette: ImageVector
    @Composable get() = PaletteDefinition.asImageVector()
