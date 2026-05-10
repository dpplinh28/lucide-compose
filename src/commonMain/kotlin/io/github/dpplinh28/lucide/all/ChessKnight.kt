package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ChessKnight") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(5f, 20f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(10f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                horizontalLineTo(6f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(16.5f, 18f)
                curveToRelative(1f, -2f, 2.5f, -5f, 2.5f, -9f)
                arcToRelative(7f, 7f, 0f, false, false, -7f, -7f)
                horizontalLineTo(6.635f)
                arcToRelative(1f, 1f, 0f, false, false, -.768f, 1.64f)
                lineTo(7f, 5f)
                lineToRelative(-2.32f, 5.802f)
                arcToRelative(2f, 2f, 0f, false, false, .95f, 2.526f)
                lineToRelative(2.87f, 1.456f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(15f, 5f)
                lineToRelative(1.425f, -1.425f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(17f, 8f)
                lineToRelative(1.53f, -1.53f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.713f, 12.185f)
                lineTo(7f, 18f)
            }
}

public val LucideIcons.All.ChessKnightDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ChessKnight: ImageVector
    @Composable get() = ChessKnightDefinition.asImageVector()
