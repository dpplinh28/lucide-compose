package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

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
