package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ArrowUpLeft") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(7f, 17f)
                verticalLineTo(7f)
                horizontalLineToRelative(10f)
            }
            lucidePath(strokeWidth) {
                moveTo(17f, 17f)
                lineTo(7f, 7f)
            }
}

public val LucideIcons.All.ArrowUpLeftDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ArrowUpLeft: ImageVector
    @Composable get() = ArrowUpLeftDefinition.asImageVector()
