package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Worm") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(19f, 12f)
                lineToRelative(-1.5f, 3f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.63f, 18.81f)
                lineTo(22f, 20f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.47f, 8.23f)
                arcToRelative(1.68f, 1.68f, 0f, false, true, 2.44f, 1.93f)
                lineToRelative(-.64f, 2.08f)
                arcToRelative(6.76f, 6.76f, 0f, false, false, 10.16f, 7.67f)
                lineToRelative(.42f, -.27f)
                arcToRelative(1f, 1f, 0f, true, false, -2.73f, -4.21f)
                lineToRelative(-.42f, .27f)
                arcToRelative(1.76f, 1.76f, 0f, false, true, -2.63f, -1.99f)
                lineToRelative(.64f, -2.08f)
                arcTo(6.66f, 6.66f, 0f, false, false, 3.94f, 3.9f)
                lineToRelative(-.7f, .4f)
                arcToRelative(1f, 1f, 0f, true, false, 2.55f, 4.34f)
                close()
            }
}

public val LucideIcons.All.WormDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Worm: ImageVector
    @Composable get() = WormDefinition.asImageVector()
