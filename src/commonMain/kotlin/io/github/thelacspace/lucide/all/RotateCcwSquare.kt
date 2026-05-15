package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("RotateCcwSquare") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(20f, 9f)
                verticalLineTo(7f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                horizontalLineToRelative(-6f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(15f, 2f)
                lineToRelative(-3f, 3f)
                lineToRelative(3f, 3f)
            }
            lucidePath(strokeWidth) {
                moveTo(20f, 13f)
                verticalLineToRelative(5f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineTo(6f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineTo(7f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(2f)
            }
}

public val LucideIcons.All.RotateCcwSquareDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.RotateCcwSquare: ImageVector
    @Composable get() = RotateCcwSquareDefinition.asImageVector()
