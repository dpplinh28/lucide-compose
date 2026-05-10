package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Flame") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 3f)
                quadToRelative(1f, 4f, 4f, 6.5f)
                reflectiveQuadToRelative(3f, 5.5f)
                arcToRelative(1f, 1f, 0f, false, true, -14f, 0f)
                arcToRelative(5f, 5f, 0f, false, true, 1f, -3f)
                arcToRelative(1f, 1f, 0f, false, false, 5f, 0f)
                curveToRelative(0f, -2f, -1.5f, -3f, -1.5f, -5f)
                quadToRelative(0f, -2f, 2.5f, -4f)
            }
}

public val LucideIcons.All.FlameDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Flame: ImageVector
    @Composable get() = FlameDefinition.asImageVector()
