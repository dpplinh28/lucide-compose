package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ChartNoAxesColumn") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(5f, 21f)
                verticalLineToRelative(-6f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 21f)
                verticalLineTo(3f)
            }
            lucidePath(strokeWidth) {
                moveTo(19f, 21f)
                verticalLineTo(9f)
            }
}

public val LucideIcons.All.ChartNoAxesColumnDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ChartNoAxesColumn: ImageVector
    @Composable get() = ChartNoAxesColumnDefinition.asImageVector()
