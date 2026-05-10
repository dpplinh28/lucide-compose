package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

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
