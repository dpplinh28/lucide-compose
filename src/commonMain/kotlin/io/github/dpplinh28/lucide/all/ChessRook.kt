package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ChessRook") { strokeWidth ->
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
                moveTo(10f, 2f)
                verticalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(14f, 2f)
                verticalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(17f, 18f)
                lineToRelative(-1f, -9f)
            }
            lucidePath(strokeWidth) {
                moveTo(6f, 2f)
                verticalLineToRelative(5f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(8f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineTo(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(6f, 4f)
                horizontalLineToRelative(12f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(7f, 18f)
                lineToRelative(1f, -9f)
            }
}

public val LucideIcons.All.ChessRookDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ChessRook: ImageVector
    @Composable get() = ChessRookDefinition.asImageVector()
