package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ListFilterPlus") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 5f)
                horizontalLineTo(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(6f, 12f)
                horizontalLineToRelative(12f)
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 19f)
                horizontalLineToRelative(6f)
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 5f)
                horizontalLineToRelative(6f)
            }
            lucidePath(strokeWidth) {
                moveTo(19f, 8f)
                verticalLineTo(2f)
            }
}

public val LucideIcons.All.ListFilterPlusDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ListFilterPlus: ImageVector
    @Composable get() = ListFilterPlusDefinition.asImageVector()
