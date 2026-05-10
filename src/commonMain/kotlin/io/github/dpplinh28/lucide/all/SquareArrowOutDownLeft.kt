package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SquareArrowOutDownLeft") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(13f, 21f)
                horizontalLineToRelative(6f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineTo(5f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                horizontalLineTo(5f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(6f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(3f, 21f)
                lineToRelative(9f, -9f)
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 21f)
                horizontalLineTo(3f)
                verticalLineToRelative(-6f)
            }
}

public val LucideIcons.All.SquareArrowOutDownLeftDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SquareArrowOutDownLeft: ImageVector
    @Composable get() = SquareArrowOutDownLeftDefinition.asImageVector()
