package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CircleSmall") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(6.0f, 12.0f)
                arcToRelative(6.0f, 6.0f, 0f, true, false, 12.0f, 0f)
                arcToRelative(6.0f, 6.0f, 0f, true, false, -12.0f, 0f)
            }
}

public val LucideIcons.All.CircleSmallDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CircleSmall: ImageVector
    @Composable get() = CircleSmallDefinition.asImageVector()
