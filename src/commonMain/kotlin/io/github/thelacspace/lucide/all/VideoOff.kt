package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("VideoOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.66f, 6f)
                horizontalLineTo(14f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(2.5f)
                lineToRelative(5.248f, -3.062f)
                arcTo(.5f, .5f, 0f, false, true, 22f, 7.87f)
                verticalLineToRelative(8.196f)
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 16f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineTo(8f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(2f, 2f)
                lineToRelative(20f, 20f)
            }
}

public val LucideIcons.All.VideoOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.VideoOff: ImageVector
    @Composable get() = VideoOffDefinition.asImageVector()
