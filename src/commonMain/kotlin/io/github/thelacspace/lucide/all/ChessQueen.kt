package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ChessQueen") { strokeWidth ->
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
                moveToRelative(12.474f, 5.943f)
                lineToRelative(1.567f, 5.34f)
                arcToRelative(1f, 1f, 0f, false, false, 1.75f, .328f)
                lineToRelative(2.616f, -3.402f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(20f, 9f)
                lineToRelative(-3f, 9f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(5.594f, 8.209f)
                lineToRelative(2.615f, 3.403f)
                arcToRelative(1f, 1f, 0f, false, false, 1.75f, -.329f)
                lineToRelative(1.567f, -5.34f)
            }
            lucidePath(strokeWidth) {
                moveTo(7f, 18f)
                lineTo(4f, 9f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, 4.0f, 0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, -4.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f, 7.0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, 4.0f, 0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, -4.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f, 7.0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, 4.0f, 0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, -4.0f, 0f)
            }
}

public val LucideIcons.All.ChessQueenDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ChessQueen: ImageVector
    @Composable get() = ChessQueenDefinition.asImageVector()
