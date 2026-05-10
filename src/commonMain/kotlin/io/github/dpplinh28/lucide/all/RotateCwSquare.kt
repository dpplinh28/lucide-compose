package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("RotateCwSquare") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 5f)
                horizontalLineTo(6f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(3f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(9f, 8f)
                lineToRelative(3f, -3f)
                lineToRelative(-3f, -3f)
            }
            lucidePath(strokeWidth) {
                moveTo(4f, 14f)
                verticalLineToRelative(4f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineTo(7f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                horizontalLineToRelative(-2f)
            }
}

public val LucideIcons.All.RotateCwSquareDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.RotateCwSquare: ImageVector
    @Composable get() = RotateCwSquareDefinition.asImageVector()
