package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SquareStop") { strokeWidth ->
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
                moveTo(10.0f, 9.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(1.0f, 0.0f, 0f, false, true, 1.0f, 0.0f)
                verticalLineToRelative(6.0f)
                arcToRelative(1.0f, 0.0f, 0f, false, true, -1.0f, 0.0f)
                horizontalLineToRelative(-4.0f)
                arcToRelative(1.0f, 0.0f, 0f, false, true, -1.0f, -0.0f)
                verticalLineToRelative(-6.0f)
                arcToRelative(1.0f, 0.0f, 0f, false, true, 1.0f, -0.0f)
                close()
            }
}

public val LucideIcons.All.SquareStopDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SquareStop: ImageVector
    @Composable get() = SquareStopDefinition.asImageVector()
