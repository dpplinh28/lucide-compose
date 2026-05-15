package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Music3") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(8.0f, 18.0f)
                arcToRelative(4.0f, 4.0f, 0f, true, false, 8.0f, 0f)
                arcToRelative(4.0f, 4.0f, 0f, true, false, -8.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 18f)
                verticalLineTo(2f)
            }
}

public val LucideIcons.All.Music3Definition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Music3: ImageVector
    @Composable get() = Music3Definition.asImageVector()
