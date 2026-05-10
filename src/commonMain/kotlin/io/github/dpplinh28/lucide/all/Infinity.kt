package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Infinity") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(6f, 16f)
                curveToRelative(5f, 0f, 7f, -8f, 12f, -8f)
                arcToRelative(4f, 4f, 0f, false, true, 0f, 8f)
                curveToRelative(-5f, 0f, -7f, -8f, -12f, -8f)
                arcToRelative(4f, 4f, 0f, true, false, 0f, 8f)
            }
}

public val LucideIcons.All.InfinityDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Infinity: ImageVector
    @Composable get() = InfinityDefinition.asImageVector()
