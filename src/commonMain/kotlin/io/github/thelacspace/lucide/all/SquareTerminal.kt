package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SquareTerminal") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(7f, 11f)
                lineToRelative(2f, -2f)
                lineToRelative(-2f, -2f)
            }
            lucidePath(strokeWidth) {
                moveTo(11f, 13f)
                horizontalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f, 3.0f)
                horizontalLineToRelative(14.0f)
                arcToRelative(2.0f, 2.0f, 0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(14.0f)
                arcToRelative(2.0f, 2.0f, 0f, false, true, -2.0f, 2.0f)
                horizontalLineToRelative(-14.0f)
                arcToRelative(2.0f, 2.0f, 0f, false, true, -2.0f, -2.0f)
                verticalLineToRelative(-14.0f)
                arcToRelative(2.0f, 2.0f, 0f, false, true, 2.0f, -2.0f)
                close()
            }
}

public val LucideIcons.All.SquareTerminalDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SquareTerminal: ImageVector
    @Composable get() = SquareTerminalDefinition.asImageVector()
