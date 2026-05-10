package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("UserStar") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16.051f, 12.616f)
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
                arcToRelative(1f, 1f, 0f, false, false, -.282f, -.866f)
                lineToRelative(-1.156f, -1.153f)
                arcToRelative(1f, 1f, 0f, false, true, .572f, -1.822f)
                lineToRelative(1.633f, -.256f)
                arcToRelative(1f, 1f, 0f, false, false, .737f, -.535f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 15f)
                horizontalLineTo(7f)
                arcToRelative(4f, 4f, 0f, false, false, -4f, 4f)
                verticalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f, 7.0f)
                arcToRelative(4.0f, 4.0f, 0f, true, false, 8.0f, 0f)
                arcToRelative(4.0f, 4.0f, 0f, true, false, -8.0f, 0f)
            }
}

public val LucideIcons.All.UserStarDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.UserStar: ImageVector
    @Composable get() = UserStarDefinition.asImageVector()
