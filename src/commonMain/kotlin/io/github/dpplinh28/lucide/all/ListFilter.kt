package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

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
