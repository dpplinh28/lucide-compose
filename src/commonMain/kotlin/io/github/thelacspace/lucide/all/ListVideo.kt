package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ListVideo") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(21f, 5f)
                horizontalLineTo(3f)
            }
            lucidePath(strokeWidth) {
                moveTo(10f, 12f)
                horizontalLineTo(3f)
            }
            lucidePath(strokeWidth) {
                moveTo(10f, 19f)
                horizontalLineTo(3f)
            }
            lucidePath(strokeWidth) {
                moveTo(15f, 12.003f)
                arcToRelative(1f, 1f, 0f, false, true, 1.517f, -.859f)
                lineToRelative(4.997f, 2.997f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, 1.718f)
                lineToRelative(-4.997f, 2.997f)
                arcToRelative(1f, 1f, 0f, false, true, -1.517f, -.86f)
                close()
            }
}

public val LucideIcons.All.ListVideoDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ListVideo: ImageVector
    @Composable get() = ListVideoDefinition.asImageVector()
