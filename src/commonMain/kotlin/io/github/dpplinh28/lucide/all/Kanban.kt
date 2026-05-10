package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Kanban") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(5f, 3f)
                verticalLineToRelative(14f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 3f)
                verticalLineToRelative(8f)
            }
            lucidePath(strokeWidth) {
                moveTo(19f, 3f)
                verticalLineToRelative(18f)
            }
}

public val LucideIcons.All.KanbanDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Kanban: ImageVector
    @Composable get() = KanbanDefinition.asImageVector()
