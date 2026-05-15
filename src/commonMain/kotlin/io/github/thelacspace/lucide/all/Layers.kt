package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Layers") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.83f, 2.18f)
                arcToRelative(2f, 2f, 0f, false, false, -1.66f, 0f)
                lineTo(2.6f, 6.08f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, 1.83f)
                lineToRelative(8.58f, 3.91f)
                arcToRelative(2f, 2f, 0f, false, false, 1.66f, 0f)
                lineToRelative(8.58f, -3.9f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -1.83f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(2f, 12f)
                arcToRelative(1f, 1f, 0f, false, false, .58f, .91f)
                lineToRelative(8.6f, 3.91f)
                arcToRelative(2f, 2f, 0f, false, false, 1.65f, 0f)
                lineToRelative(8.58f, -3.9f)
                arcTo(1f, 1f, 0f, false, false, 22f, 12f)
            }
            lucidePath(strokeWidth) {
                moveTo(2f, 17f)
                arcToRelative(1f, 1f, 0f, false, false, .58f, .91f)
                lineToRelative(8.6f, 3.91f)
                arcToRelative(2f, 2f, 0f, false, false, 1.65f, 0f)
                lineToRelative(8.58f, -3.9f)
                arcTo(1f, 1f, 0f, false, false, 22f, 17f)
            }
}

public val LucideIcons.All.LayersDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Layers: ImageVector
    @Composable get() = LayersDefinition.asImageVector()
