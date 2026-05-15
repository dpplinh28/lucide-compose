package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ListCollapse") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10f, 5f)
                horizontalLineToRelative(11f)
            }
            lucidePath(strokeWidth) {
                moveTo(10f, 12f)
                horizontalLineToRelative(11f)
            }
            lucidePath(strokeWidth) {
                moveTo(10f, 19f)
                horizontalLineToRelative(11f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(3f, 10f)
                lineToRelative(3f, -3f)
                lineToRelative(-3f, -3f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(3f, 20f)
                lineToRelative(3f, -3f)
                lineToRelative(-3f, -3f)
            }
}

public val LucideIcons.All.ListCollapseDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ListCollapse: ImageVector
    @Composable get() = ListCollapseDefinition.asImageVector()
