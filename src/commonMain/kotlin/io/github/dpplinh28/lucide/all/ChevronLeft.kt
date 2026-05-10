package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ChevronLeft") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(15f, 18f)
                lineToRelative(-6f, -6f)
                lineToRelative(6f, -6f)
            }
}

public val LucideIcons.All.ChevronLeftDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ChevronLeft: ImageVector
    @Composable get() = ChevronLeftDefinition.asImageVector()
