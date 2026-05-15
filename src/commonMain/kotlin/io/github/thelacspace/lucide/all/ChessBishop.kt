package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ChessBishop") { strokeWidth ->
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
                moveTo(15f, 18f)
                curveToRelative(1.5f, -.615f, 3f, -2.461f, 3f, -4.923f)
                curveTo(18f, 8.769f, 14.5f, 4.462f, 12f, 2f)
                curveTo(9.5f, 4.462f, 6f, 8.77f, 6f, 13.077f)
                curveTo(6f, 15.539f, 7.5f, 17.385f, 9f, 18f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(16f, 7f)
                lineToRelative(-2.5f, 2.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 2f)
                horizontalLineToRelative(6f)
            }
}

public val LucideIcons.All.ChessBishopDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ChessBishop: ImageVector
    @Composable get() = ChessBishopDefinition.asImageVector()
