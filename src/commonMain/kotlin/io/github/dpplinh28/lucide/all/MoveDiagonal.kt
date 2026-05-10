package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MoveDiagonal") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11f, 19f)
                horizontalLineTo(5f)
                verticalLineToRelative(-6f)
            }
            lucidePath(strokeWidth) {
                moveTo(13f, 5f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(6f)
            }
            lucidePath(strokeWidth) {
                moveTo(19f, 5f)
                lineTo(5f, 19f)
            }
}

public val LucideIcons.All.MoveDiagonalDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MoveDiagonal: ImageVector
    @Composable get() = MoveDiagonalDefinition.asImageVector()
