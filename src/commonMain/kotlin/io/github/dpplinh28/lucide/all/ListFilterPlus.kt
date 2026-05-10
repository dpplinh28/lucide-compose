package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

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
