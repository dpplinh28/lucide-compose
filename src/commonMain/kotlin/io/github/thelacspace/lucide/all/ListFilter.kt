package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ListFilter") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2f, 5f)
                horizontalLineToRelative(20f)
            }
            lucidePath(strokeWidth) {
                moveTo(6f, 12f)
                horizontalLineToRelative(12f)
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 19f)
                horizontalLineToRelative(6f)
            }
}

public val LucideIcons.All.ListFilterDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ListFilter: ImageVector
    @Composable get() = ListFilterDefinition.asImageVector()
