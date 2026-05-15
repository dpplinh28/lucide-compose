package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Video") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(16f, 13f)
                lineToRelative(5.223f, 3.482f)
                arcToRelative(.5f, .5f, 0f, false, false, .777f, -.416f)
                verticalLineTo(7.87f)
                arcToRelative(.5f, .5f, 0f, false, false, -.752f, -.432f)
                lineTo(16f, 10.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f, 6.0f)
                horizontalLineToRelative(10.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, 2.0f, 0.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, -2.0f, 0.0f)
                horizontalLineToRelative(-10.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, -2.0f, -0.0f)
                verticalLineToRelative(-12.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, 2.0f, -0.0f)
                close()
            }
}

public val LucideIcons.All.VideoDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Video: ImageVector
    @Composable get() = VideoDefinition.asImageVector()
