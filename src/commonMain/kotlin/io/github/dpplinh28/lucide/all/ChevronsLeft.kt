package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ChevronsLeft") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(11f, 17f)
                lineToRelative(-5f, -5f)
                lineToRelative(5f, -5f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(18f, 17f)
                lineToRelative(-5f, -5f)
                lineToRelative(5f, -5f)
            }
}

public val LucideIcons.All.ChevronsLeftDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ChevronsLeft: ImageVector
    @Composable get() = ChevronsLeftDefinition.asImageVector()
