package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MapPinned") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(18f, 8f)
                curveToRelative(0f, 3.613f, -3.869f, 7.429f, -5.393f, 8.795f)
                arcToRelative(1f, 1f, 0f, false, true, -1.214f, 0f)
                curveTo(9.87f, 15.429f, 6f, 11.613f, 6f, 8f)
                arcToRelative(6f, 6f, 0f, false, true, 12f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f, 8.0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, 4.0f, 0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, -4.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.714f, 14f)
                horizontalLineToRelative(-3.71f)
                arcToRelative(1f, 1f, 0f, false, false, -.948f, .683f)
                lineToRelative(-2.004f, 6f)
                arcTo(1f, 1f, 0f, false, false, 3f, 22f)
                horizontalLineToRelative(18f)
                arcToRelative(1f, 1f, 0f, false, false, .948f, -1.316f)
                lineToRelative(-2f, -6f)
                arcToRelative(1f, 1f, 0f, false, false, -.949f, -.684f)
                horizontalLineToRelative(-3.712f)
            }
}

public val LucideIcons.All.MapPinnedDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MapPinned: ImageVector
    @Composable get() = MapPinnedDefinition.asImageVector()
