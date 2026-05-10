package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("TrendingUpDown") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14.828f, 14.828f)
                lineTo(21f, 21f)
            }
            lucidePath(strokeWidth) {
                moveTo(21f, 16f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-5f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(21f, 3f)
                lineToRelative(-9f, 9f)
                lineToRelative(-4f, -4f)
                lineToRelative(-6f, 6f)
            }
            lucidePath(strokeWidth) {
                moveTo(21f, 8f)
                verticalLineTo(3f)
                horizontalLineToRelative(-5f)
            }
}

public val LucideIcons.All.TrendingUpDownDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.TrendingUpDown: ImageVector
    @Composable get() = TrendingUpDownDefinition.asImageVector()
