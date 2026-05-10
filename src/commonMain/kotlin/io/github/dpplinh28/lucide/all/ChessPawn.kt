package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ChessPawn") { strokeWidth ->
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
                moveToRelative(14.5f, 10f)
                lineToRelative(1.5f, 8f)
            }
            lucidePath(strokeWidth) {
                moveTo(7f, 10f)
                horizontalLineToRelative(10f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(8f, 18f)
                lineToRelative(1.5f, -8f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f, 6.0f)
                arcToRelative(4.0f, 4.0f, 0f, true, false, 8.0f, 0f)
                arcToRelative(4.0f, 4.0f, 0f, true, false, -8.0f, 0f)
            }
}

public val LucideIcons.All.ChessPawnDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ChessPawn: ImageVector
    @Composable get() = ChessPawnDefinition.asImageVector()
