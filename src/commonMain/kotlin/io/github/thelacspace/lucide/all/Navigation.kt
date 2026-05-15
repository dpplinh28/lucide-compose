package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Navigation") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3f, 11f)
                lineTo(22f, 2f)
                lineTo(13f, 21f)
                lineTo(11f, 13f)
                lineTo(3f, 11f)
                close()
            }
}

public val LucideIcons.All.NavigationDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Navigation: ImageVector
    @Composable get() = NavigationDefinition.asImageVector()
