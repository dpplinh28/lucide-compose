package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ThumbsDown") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(9f, 18.12f)
                lineTo(10f, 14f)
                horizontalLineTo(4.17f)
                arcToRelative(2f, 2f, 0f, false, true, -1.92f, -2.56f)
                lineToRelative(2.33f, -8f)
                arcTo(2f, 2f, 0f, false, true, 6.5f, 2f)
                horizontalLineTo(20f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(8f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineToRelative(-2.76f)
                arcToRelative(2f, 2f, 0f, false, false, -1.79f, 1.11f)
                lineTo(12f, 22f)
                arcToRelative(3.13f, 3.13f, 0f, false, true, -3f, -3.88f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(17f, 14f)
                verticalLineTo(2f)
            }
}

public val LucideIcons.All.ThumbsDownDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ThumbsDown: ImageVector
    @Composable get() = ThumbsDownDefinition.asImageVector()
