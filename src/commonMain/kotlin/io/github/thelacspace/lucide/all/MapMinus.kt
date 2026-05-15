package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MapMinus") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(11f, 19f)
                lineToRelative(-1.106f, -.552f)
                arcToRelative(2f, 2f, 0f, false, false, -1.788f, 0f)
                lineToRelative(-3.659f, 1.83f)
                arcTo(1f, 1f, 0f, false, true, 3f, 19.381f)
                verticalLineTo(6.618f)
                arcToRelative(1f, 1f, 0f, false, true, .553f, -.894f)
                lineToRelative(4.553f, -2.277f)
                arcToRelative(2f, 2f, 0f, false, true, 1.788f, 0f)
                lineToRelative(4.212f, 2.106f)
                arcToRelative(2f, 2f, 0f, false, false, 1.788f, 0f)
                lineToRelative(3.659f, -1.83f)
                arcTo(1f, 1f, 0f, false, true, 21f, 4.619f)
                verticalLineTo(14f)
            }
            lucidePath(strokeWidth) {
                moveTo(15f, 5.764f)
                verticalLineTo(14f)
            }
            lucidePath(strokeWidth) {
                moveTo(21f, 18f)
                horizontalLineToRelative(-6f)
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 3.236f)
                verticalLineToRelative(15f)
            }
}

public val LucideIcons.All.MapMinusDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MapMinus: ImageVector
    @Composable get() = MapMinusDefinition.asImageVector()
