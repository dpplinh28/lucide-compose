package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Recycle") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(7f, 19f)
                horizontalLineTo(4.815f)
                arcToRelative(1.83f, 1.83f, 0f, false, true, -1.57f, -.881f)
                arcToRelative(1.785f, 1.785f, 0f, false, true, -.004f, -1.784f)
                lineTo(7.196f, 9.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(11f, 19f)
                horizontalLineToRelative(8.203f)
                arcToRelative(1.83f, 1.83f, 0f, false, false, 1.556f, -.89f)
                arcToRelative(1.784f, 1.784f, 0f, false, false, 0f, -1.775f)
                lineToRelative(-1.226f, -2.12f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(14f, 16f)
                lineToRelative(-3f, 3f)
                lineToRelative(3f, 3f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.293f, 13.596f)
                lineTo(7.196f, 9.5f)
                lineTo(3.1f, 10.598f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(9.344f, 5.811f)
                lineToRelative(1.093f, -1.892f)
                arcTo(1.83f, 1.83f, 0f, false, true, 11.985f, 3f)
                arcToRelative(1.784f, 1.784f, 0f, false, true, 1.546f, .888f)
                lineToRelative(3.943f, 6.843f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(13.378f, 9.633f)
                lineToRelative(4.096f, 1.098f)
                lineToRelative(1.097f, -4.096f)
            }
}

public val LucideIcons.All.RecycleDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Recycle: ImageVector
    @Composable get() = RecycleDefinition.asImageVector()
