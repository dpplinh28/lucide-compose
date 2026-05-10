package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ChevronDown") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(6f, 9f)
                lineToRelative(6f, 6f)
                lineToRelative(6f, -6f)
            }
}

public val LucideIcons.All.ChevronDownDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ChevronDown: ImageVector
    @Composable get() = ChevronDownDefinition.asImageVector()
