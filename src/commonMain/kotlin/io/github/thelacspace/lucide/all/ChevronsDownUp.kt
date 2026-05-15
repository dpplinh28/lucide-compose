package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ChevronsDownUp") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(7f, 20f)
                lineToRelative(5f, -5f)
                lineToRelative(5f, 5f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(7f, 4f)
                lineToRelative(5f, 5f)
                lineToRelative(5f, -5f)
            }
}

public val LucideIcons.All.ChevronsDownUpDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ChevronsDownUp: ImageVector
    @Composable get() = ChevronsDownUpDefinition.asImageVector()
