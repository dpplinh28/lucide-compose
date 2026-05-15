package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Eraser") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(21f, 21f)
                horizontalLineTo(8f)
                arcToRelative(2f, 2f, 0f, false, true, -1.42f, -.587f)
                lineToRelative(-3.994f, -3.999f)
                arcToRelative(2f, 2f, 0f, false, true, 0f, -2.828f)
                lineToRelative(10f, -10f)
                arcToRelative(2f, 2f, 0f, false, true, 2.829f, 0f)
                lineToRelative(5.999f, 6f)
                arcToRelative(2f, 2f, 0f, false, true, 0f, 2.828f)
                lineTo(12.834f, 21f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(5.082f, 11.09f)
                lineToRelative(8.828f, 8.828f)
            }
}

public val LucideIcons.All.EraserDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Eraser: ImageVector
    @Composable get() = EraserDefinition.asImageVector()
