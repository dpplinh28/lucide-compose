package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Bubbles") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(7.001f, 15.085f)
                arcTo(1.5f, 1.5f, 0f, false, true, 9f, 16.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f, 8.5f)
                arcToRelative(3.5f, 3.5f, 0f, true, false, 7.0f, 0f)
                arcToRelative(3.5f, 3.5f, 0f, true, false, -7.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f, 16.5f)
                arcToRelative(5.5f, 5.5f, 0f, true, false, 11.0f, 0f)
                arcToRelative(5.5f, 5.5f, 0f, true, false, -11.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f, 4.5f)
                arcToRelative(2.5f, 2.5f, 0f, true, false, 5.0f, 0f)
                arcToRelative(2.5f, 2.5f, 0f, true, false, -5.0f, 0f)
            }
}

public val LucideIcons.All.BubblesDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Bubbles: ImageVector
    @Composable get() = BubblesDefinition.asImageVector()
