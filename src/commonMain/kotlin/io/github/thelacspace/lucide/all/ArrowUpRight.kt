package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ArrowUpRight") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(7f, 7f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(10f)
            }
            lucidePath(strokeWidth) {
                moveTo(7f, 17f)
                lineTo(17f, 7f)
            }
}

public val LucideIcons.All.ArrowUpRightDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ArrowUpRight: ImageVector
    @Composable get() = ArrowUpRightDefinition.asImageVector()
