package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

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
