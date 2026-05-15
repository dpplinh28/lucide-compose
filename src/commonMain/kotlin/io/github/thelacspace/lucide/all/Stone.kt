package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Stone") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.264f, 2.205f)
                arcTo(4f, 4f, 0f, false, false, 6.42f, 4.211f)
                lineToRelative(-4f, 8f)
                arcToRelative(4f, 4f, 0f, false, false, 1.359f, 5.117f)
                lineToRelative(6f, 4f)
                arcToRelative(4f, 4f, 0f, false, false, 4.438f, 0f)
                lineToRelative(6f, -4f)
                arcToRelative(4f, 4f, 0f, false, false, 1.576f, -4.592f)
                lineToRelative(-2f, -6f)
                arcToRelative(4f, 4f, 0f, false, false, -2.53f, -2.53f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(11.99f, 22f)
                lineTo(14f, 12f)
                lineToRelative(7.822f, 3.184f)
            }
            lucidePath(strokeWidth) {
                moveTo(14f, 12f)
                lineTo(8.47f, 2.302f)
            }
}

public val LucideIcons.All.StoneDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Stone: ImageVector
    @Composable get() = StoneDefinition.asImageVector()
