package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("RectangleGoggles") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(20f, 6f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(8f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineToRelative(-4f)
                arcToRelative(2f, 2f, 0f, false, true, -1.6f, -.8f)
                lineToRelative(-1.6f, -2.13f)
                arcToRelative(1f, 1f, 0f, false, false, -1.6f, 0f)
                lineTo(9.6f, 17.2f)
                arcTo(2f, 2f, 0f, false, true, 8f, 18f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineTo(8f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                close()
            }
}

public val LucideIcons.All.RectangleGogglesDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.RectangleGoggles: ImageVector
    @Composable get() = RectangleGogglesDefinition.asImageVector()
