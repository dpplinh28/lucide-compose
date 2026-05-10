package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ChartNoAxesColumnIncreasing") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(5f, 21f)
                verticalLineToRelative(-6f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 21f)
                verticalLineTo(9f)
            }
            lucidePath(strokeWidth) {
                moveTo(19f, 21f)
                verticalLineTo(3f)
            }
}

public val LucideIcons.All.ChartNoAxesColumnIncreasingDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ChartNoAxesColumnIncreasing: ImageVector
    @Composable get() = ChartNoAxesColumnIncreasingDefinition.asImageVector()
