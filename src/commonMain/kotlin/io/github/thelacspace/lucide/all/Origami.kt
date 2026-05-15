package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Origami") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 12f)
                verticalLineTo(4f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                horizontalLineToRelative(6.297f)
                arcToRelative(1f, 1f, 0f, false, true, .651f, 1.759f)
                lineToRelative(-4.696f, 4.025f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(12f, 21f)
                lineToRelative(-7.414f, -7.414f)
                arcTo(2f, 2f, 0f, false, true, 4f, 12.172f)
                verticalLineTo(6.415f)
                arcToRelative(1.002f, 1.002f, 0f, false, true, 1.707f, -.707f)
                lineTo(20f, 20.009f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(12.214f, 3.381f)
                lineToRelative(8.414f, 14.966f)
                arcToRelative(1f, 1f, 0f, false, true, -.167f, 1.199f)
                lineToRelative(-1.168f, 1.163f)
                arcToRelative(1f, 1f, 0f, false, true, -.706f, .291f)
                horizontalLineTo(6.351f)
                arcToRelative(1f, 1f, 0f, false, true, -.625f, -.219f)
                lineTo(3.25f, 18.8f)
                arcToRelative(1f, 1f, 0f, false, true, .631f, -1.781f)
                lineToRelative(4.165f, .027f)
            }
}

public val LucideIcons.All.OrigamiDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Origami: ImageVector
    @Composable get() = OrigamiDefinition.asImageVector()
