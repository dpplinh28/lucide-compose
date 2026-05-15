package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("PaintBucket") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11f, 7f)
                lineTo(6f, 2f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.992f, 12f)
                horizontalLineTo(2.041f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.145f, 18.38f)
                arcTo(3.34f, 3.34f, 0f, false, true, 20f, 16.5f)
                arcToRelative(3.3f, 3.3f, 0f, false, true, -1.145f, 1.88f)
                curveToRelative(-.575f, .46f, -.855f, 1.02f, -.855f, 1.595f)
                arcTo(2f, 2f, 0f, false, false, 20f, 22f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2.025f)
                curveToRelative(0f, -.58f, -.285f, -1.13f, -.855f, -1.595f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(8.5f, 4.5f)
                lineToRelative(2.148f, -2.148f)
                arcToRelative(1.205f, 1.205f, 0f, false, true, 1.704f, 0f)
                lineToRelative(7.296f, 7.296f)
                arcToRelative(1.205f, 1.205f, 0f, false, true, 0f, 1.704f)
                lineToRelative(-7.592f, 7.592f)
                arcToRelative(3.615f, 3.615f, 0f, false, true, -5.112f, 0f)
                lineToRelative(-3.888f, -3.888f)
                arcToRelative(3.615f, 3.615f, 0f, false, true, 0f, -5.112f)
                lineTo(5.67f, 7.33f)
            }
}

public val LucideIcons.All.PaintBucketDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.PaintBucket: ImageVector
    @Composable get() = PaintBucketDefinition.asImageVector()
