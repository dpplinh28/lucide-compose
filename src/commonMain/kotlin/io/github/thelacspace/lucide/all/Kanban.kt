package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

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
