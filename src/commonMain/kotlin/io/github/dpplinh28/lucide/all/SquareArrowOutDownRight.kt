package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SquareArrowOutDownRight") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(21f, 11f)
                verticalLineTo(5f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                horizontalLineTo(5f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(14f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(6f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(21f, 21f)
                lineToRelative(-9f, -9f)
            }
            lucidePath(strokeWidth) {
                moveTo(21f, 15f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-6f)
            }
}

public val LucideIcons.All.SquareArrowOutDownRightDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SquareArrowOutDownRight: ImageVector
    @Composable get() = SquareArrowOutDownRightDefinition.asImageVector()
