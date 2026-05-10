package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ChessKing") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4f, 20f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                horizontalLineTo(5f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                close()
            }
            lucidePath(strokeWidth) {
                moveToRelative(6.7f, 18f)
                lineToRelative(-1f, -1f)
                curveTo(4.35f, 15.682f, 3f, 14.09f, 3f, 12f)
                arcToRelative(5f, 5f, 0f, false, true, 4.95f, -5f)
                curveToRelative(1.584f, 0f, 2.7f, .455f, 4.05f, 1.818f)
                curveTo(13.35f, 7.455f, 14.466f, 7f, 16.05f, 7f)
                arcTo(5f, 5f, 0f, false, true, 21f, 12f)
                curveToRelative(0f, 2.082f, -1.359f, 3.673f, -2.7f, 5f)
                lineToRelative(-1f, 1f)
            }
            lucidePath(strokeWidth) {
                moveTo(10f, 4f)
                horizontalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 2f)
                verticalLineToRelative(6.818f)
            }
}

public val LucideIcons.All.ChessKingDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ChessKing: ImageVector
    @Composable get() = ChessKingDefinition.asImageVector()
