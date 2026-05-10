package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ChartColumnDecreasing") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(13f, 17f)
                verticalLineTo(9f)
            }
            lucidePath(strokeWidth) {
                moveTo(18f, 17f)
                verticalLineToRelative(-3f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 3f)
                verticalLineToRelative(16f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(16f)
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 17f)
                verticalLineTo(5f)
            }
}

public val LucideIcons.All.ChartColumnDecreasingDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ChartColumnDecreasing: ImageVector
    @Composable get() = ChartColumnDecreasingDefinition.asImageVector()
