package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SquareScissors") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(5.0f, 3.0f)
                horizontalLineToRelative(14.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, 2.0f, 0.0f)
                verticalLineToRelative(18.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, -2.0f, 0.0f)
                horizontalLineToRelative(-14.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, -2.0f, -0.0f)
                verticalLineToRelative(-18.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, 2.0f, -0.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f, 8.5f)
                arcToRelative(1.5f, 1.5f, 0f, true, false, 3.0f, 0f)
                arcToRelative(1.5f, 1.5f, 0f, true, false, -3.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.56066f, 9.56066f)
                lineTo(12f, 12f)
            }
            lucidePath(strokeWidth) {
                moveTo(17f, 17f)
                lineTo(14.82f, 14.82f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f, 15.5f)
                arcToRelative(1.5f, 1.5f, 0f, true, false, 3.0f, 0f)
                arcToRelative(1.5f, 1.5f, 0f, true, false, -3.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.56066f, 14.43934f)
                lineTo(17f, 7f)
            }
}

public val LucideIcons.All.SquareScissorsDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SquareScissors: ImageVector
    @Composable get() = SquareScissorsDefinition.asImageVector()
