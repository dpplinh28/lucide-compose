package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SquareArrowOutUpRight") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(21f, 13f)
                verticalLineToRelative(6f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineTo(5f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineTo(5f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(6f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(21f, 3f)
                lineToRelative(-9f, 9f)
            }
            lucidePath(strokeWidth) {
                moveTo(15f, 3f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(6f)
            }
}

public val LucideIcons.All.SquareArrowOutUpRightDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SquareArrowOutUpRight: ImageVector
    @Composable get() = SquareArrowOutUpRightDefinition.asImageVector()
