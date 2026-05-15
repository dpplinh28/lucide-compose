package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Minus") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(5f, 12f)
                horizontalLineToRelative(14f)
            }
}

public val LucideIcons.All.MinusDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Minus: ImageVector
    @Composable get() = MinusDefinition.asImageVector()
