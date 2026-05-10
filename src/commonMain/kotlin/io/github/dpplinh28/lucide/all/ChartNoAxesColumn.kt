package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

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
