package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ArrowUpToLine") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(5f, 3f)
                horizontalLineToRelative(14f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(18f, 13f)
                lineToRelative(-6f, -6f)
                lineToRelative(-6f, 6f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 7f)
                verticalLineToRelative(14f)
            }
}

public val LucideIcons.All.ArrowUpToLineDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ArrowUpToLine: ImageVector
    @Composable get() = ArrowUpToLineDefinition.asImageVector()
