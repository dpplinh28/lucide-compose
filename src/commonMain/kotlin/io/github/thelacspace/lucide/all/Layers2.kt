package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Layers2") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(13f, 13.74f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 0f)
                lineTo(2.5f, 8.87f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, -1.74f)
                lineTo(11f, 2.26f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 0f)
                lineToRelative(8.5f, 4.87f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, 1.74f)
                close()
            }
            lucidePath(strokeWidth) {
                moveToRelative(20f, 14.285f)
                lineToRelative(1.5f, .845f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, 1.74f)
                lineTo(13f, 21.74f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 0f)
                lineToRelative(-8.5f, -4.87f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, -1.74f)
                lineToRelative(1.5f, -.845f)
            }
}

public val LucideIcons.All.Layers2Definition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Layers2: ImageVector
    @Composable get() = Layers2Definition.asImageVector()
