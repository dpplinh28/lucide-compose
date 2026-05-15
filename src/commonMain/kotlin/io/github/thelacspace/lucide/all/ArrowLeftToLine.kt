package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ArrowLeftToLine") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3f, 19f)
                verticalLineTo(5f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(13f, 6f)
                lineToRelative(-6f, 6f)
                lineToRelative(6f, 6f)
            }
            lucidePath(strokeWidth) {
                moveTo(7f, 12f)
                horizontalLineToRelative(14f)
            }
}

public val LucideIcons.All.ArrowLeftToLineDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ArrowLeftToLine: ImageVector
    @Composable get() = ArrowLeftToLineDefinition.asImageVector()
