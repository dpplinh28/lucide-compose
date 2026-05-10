package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SquareSplitVertical") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(5f, 8f)
                verticalLineTo(5f)
                curveToRelative(0f, -1f, 1f, -2f, 2f, -2f)
                horizontalLineToRelative(10f)
                curveToRelative(1f, 0f, 2f, 1f, 2f, 2f)
                verticalLineToRelative(3f)
            }
            lucidePath(strokeWidth) {
                moveTo(19f, 16f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 1f, -1f, 2f, -2f, 2f)
                horizontalLineTo(7f)
                curveToRelative(-1f, 0f, -2f, -1f, -2f, -2f)
                verticalLineToRelative(-3f)
            }
            lucidePath(strokeWidth) {
                moveTo(4f, 12f)
                lineTo(20f, 12f)
            }
}

public val LucideIcons.All.SquareSplitVerticalDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SquareSplitVertical: ImageVector
    @Composable get() = SquareSplitVerticalDefinition.asImageVector()
