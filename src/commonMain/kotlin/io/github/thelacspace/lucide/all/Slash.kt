package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Slash") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(22f, 2f)
                lineTo(2f, 22f)
            }
}

public val LucideIcons.All.SlashDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Slash: ImageVector
    @Composable get() = SlashDefinition.asImageVector()
