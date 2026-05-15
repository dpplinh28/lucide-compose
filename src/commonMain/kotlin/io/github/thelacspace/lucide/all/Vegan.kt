package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Vegan") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16f, 8f)
                quadToRelative(6f, 0f, 6f, -6f)
                quadToRelative(-6f, 0f, -6f, 6f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.41f, 3.59f)
                arcToRelative(10f, 10f, 0f, true, false, 3f, 3f)
            }
            lucidePath(strokeWidth) {
                moveTo(2f, 2f)
                arcToRelative(26.6f, 26.6f, 0f, false, true, 10f, 20f)
                curveToRelative(.9f, -6.82f, 1.5f, -9.5f, 4f, -14f)
            }
}

public val LucideIcons.All.VeganDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Vegan: ImageVector
    @Composable get() = VeganDefinition.asImageVector()
