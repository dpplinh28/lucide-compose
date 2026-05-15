package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CircleStar") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0f, 12.0f)
                arcToRelative(10.0f, 10.0f, 0f, true, false, 20.0f, 0f)
                arcToRelative(10.0f, 10.0f, 0f, true, false, -20.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(11.051f, 7.616f)
                arcToRelative(1f, 1f, 0f, false, true, 1.909f, .024f)
                lineToRelative(.737f, 1.452f)
                arcToRelative(1f, 1f, 0f, false, false, .737f, .535f)
                lineToRelative(1.634f, .256f)
                arcToRelative(1f, 1f, 0f, false, true, .588f, 1.806f)
                lineToRelative(-1.172f, 1.168f)
                arcToRelative(1f, 1f, 0f, false, false, -.282f, .866f)
                lineToRelative(.259f, 1.613f)
                arcToRelative(1f, 1f, 0f, false, true, -1.541f, 1.134f)
                lineToRelative(-1.465f, -.75f)
                arcToRelative(1f, 1f, 0f, false, false, -.912f, 0f)
                lineToRelative(-1.465f, .75f)
                arcToRelative(1f, 1f, 0f, false, true, -1.539f, -1.133f)
                lineToRelative(.258f, -1.613f)
                arcToRelative(1f, 1f, 0f, false, false, -.282f, -.867f)
                lineToRelative(-1.156f, -1.152f)
                arcToRelative(1f, 1f, 0f, false, true, .572f, -1.822f)
                lineToRelative(1.633f, -.256f)
                arcToRelative(1f, 1f, 0f, false, false, .737f, -.535f)
                close()
            }
}

public val LucideIcons.All.CircleStarDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CircleStar: ImageVector
    @Composable get() = CircleStarDefinition.asImageVector()
