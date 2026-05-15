package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ArrowDownWideNarrow") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(3f, 16f)
                lineToRelative(4f, 4f)
                lineToRelative(4f, -4f)
            }
            lucidePath(strokeWidth) {
                moveTo(7f, 20f)
                verticalLineTo(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(11f, 4f)
                horizontalLineToRelative(10f)
            }
            lucidePath(strokeWidth) {
                moveTo(11f, 8f)
                horizontalLineToRelative(7f)
            }
            lucidePath(strokeWidth) {
                moveTo(11f, 12f)
                horizontalLineToRelative(4f)
            }
}

public val LucideIcons.All.ArrowDownWideNarrowDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ArrowDownWideNarrow: ImageVector
    @Composable get() = ArrowDownWideNarrowDefinition.asImageVector()
