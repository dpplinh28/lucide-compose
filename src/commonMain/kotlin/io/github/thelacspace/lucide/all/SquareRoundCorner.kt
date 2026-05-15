package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SquareRoundCorner") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(21f, 11f)
                arcToRelative(8f, 8f, 0f, false, false, -8f, -8f)
            }
            lucidePath(strokeWidth) {
                moveTo(21f, 15f)
                verticalLineToRelative(4f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineTo(5f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineTo(5f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(4f)
            }
}

public val LucideIcons.All.SquareRoundCornerDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SquareRoundCorner: ImageVector
    @Composable get() = SquareRoundCornerDefinition.asImageVector()
