package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Music2") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.0f, 18.0f)
                arcToRelative(4.0f, 4.0f, 0f, true, false, 8.0f, 0f)
                arcToRelative(4.0f, 4.0f, 0f, true, false, -8.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 18f)
                verticalLineTo(2f)
                lineToRelative(7f, 4f)
            }
}

public val LucideIcons.All.Music2Definition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Music2: ImageVector
    @Composable get() = Music2Definition.asImageVector()
