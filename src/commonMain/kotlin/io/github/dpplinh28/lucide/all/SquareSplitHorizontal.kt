package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SquareSplitHorizontal") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(8f, 19f)
                horizontalLineTo(5f)
                curveToRelative(-1f, 0f, -2f, -1f, -2f, -2f)
                verticalLineTo(7f)
                curveToRelative(0f, -1f, 1f, -2f, 2f, -2f)
                horizontalLineToRelative(3f)
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 5f)
                horizontalLineToRelative(3f)
                curveToRelative(1f, 0f, 2f, 1f, 2f, 2f)
                verticalLineToRelative(10f)
                curveToRelative(0f, 1f, -1f, 2f, -2f, 2f)
                horizontalLineToRelative(-3f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 4f)
                lineTo(12f, 20f)
            }
}

public val LucideIcons.All.SquareSplitHorizontalDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SquareSplitHorizontal: ImageVector
    @Composable get() = SquareSplitHorizontalDefinition.asImageVector()
