package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ChartBarIncreasing") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3f, 3f)
                verticalLineToRelative(16f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(16f)
            }
            lucidePath(strokeWidth) {
                moveTo(7f, 11f)
                horizontalLineToRelative(8f)
            }
            lucidePath(strokeWidth) {
                moveTo(7f, 16f)
                horizontalLineToRelative(12f)
            }
            lucidePath(strokeWidth) {
                moveTo(7f, 6f)
                horizontalLineToRelative(3f)
            }
}

public val LucideIcons.All.ChartBarIncreasingDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ChartBarIncreasing: ImageVector
    @Composable get() = ChartBarIncreasingDefinition.asImageVector()
