package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SquareArrowRightExit") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10f, 12f)
                horizontalLineToRelative(11f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(17f, 16f)
                lineToRelative(4f, -4f)
                lineToRelative(-4f, -4f)
            }
            lucidePath(strokeWidth) {
                moveTo(21f, 6.344f)
                verticalLineTo(5f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                horizontalLineTo(5f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(14f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(14f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineToRelative(-1.344f)
            }
}

public val LucideIcons.All.SquareArrowRightExitDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SquareArrowRightExit: ImageVector
    @Composable get() = SquareArrowRightExitDefinition.asImageVector()
