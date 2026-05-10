package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ArrowUpWideNarrow") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(3f, 8f)
                lineToRelative(4f, -4f)
                lineToRelative(4f, 4f)
            }
            lucidePath(strokeWidth) {
                moveTo(7f, 4f)
                verticalLineToRelative(16f)
            }
            lucidePath(strokeWidth) {
                moveTo(11f, 12f)
                horizontalLineToRelative(10f)
            }
            lucidePath(strokeWidth) {
                moveTo(11f, 16f)
                horizontalLineToRelative(7f)
            }
            lucidePath(strokeWidth) {
                moveTo(11f, 20f)
                horizontalLineToRelative(4f)
            }
}

public val LucideIcons.All.ArrowUpWideNarrowDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ArrowUpWideNarrow: ImageVector
    @Composable get() = ArrowUpWideNarrowDefinition.asImageVector()
