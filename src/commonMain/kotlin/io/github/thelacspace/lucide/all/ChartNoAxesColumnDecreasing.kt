package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ChartNoAxesColumnDecreasing") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(5f, 21f)
                verticalLineTo(3f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 21f)
                verticalLineTo(9f)
            }
            lucidePath(strokeWidth) {
                moveTo(19f, 21f)
                verticalLineToRelative(-6f)
            }
}

public val LucideIcons.All.ChartNoAxesColumnDecreasingDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ChartNoAxesColumnDecreasing: ImageVector
    @Composable get() = ChartNoAxesColumnDecreasingDefinition.asImageVector()
