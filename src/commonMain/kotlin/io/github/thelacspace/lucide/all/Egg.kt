package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Egg") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 2f)
                curveTo(8f, 2f, 4f, 8f, 4f, 14f)
                arcToRelative(8f, 8f, 0f, false, false, 16f, 0f)
                curveToRelative(0f, -6f, -4f, -12f, -8f, -12f)
            }
}

public val LucideIcons.All.EggDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Egg: ImageVector
    @Composable get() = EggDefinition.asImageVector()
