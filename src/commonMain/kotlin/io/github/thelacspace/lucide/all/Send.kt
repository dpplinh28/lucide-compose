package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Send") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14.536f, 21.686f)
                arcToRelative(.5f, .5f, 0f, false, false, .937f, -.024f)
                lineToRelative(6.5f, -19f)
                arcToRelative(.496f, .496f, 0f, false, false, -.635f, -.635f)
                lineToRelative(-19f, 6.5f)
                arcToRelative(.5f, .5f, 0f, false, false, -.024f, .937f)
                lineToRelative(7.93f, 3.18f)
                arcToRelative(2f, 2f, 0f, false, true, 1.112f, 1.11f)
                close()
            }
            lucidePath(strokeWidth) {
                moveToRelative(21.854f, 2.147f)
                lineToRelative(-10.94f, 10.939f)
            }
}

public val LucideIcons.All.SendDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Send: ImageVector
    @Composable get() = SendDefinition.asImageVector()
