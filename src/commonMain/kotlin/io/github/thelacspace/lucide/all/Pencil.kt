package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Pencil") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(21.174f, 6.812f)
                arcToRelative(1f, 1f, 0f, false, false, -3.986f, -3.987f)
                lineTo(3.842f, 16.174f)
                arcToRelative(2f, 2f, 0f, false, false, -.5f, .83f)
                lineToRelative(-1.321f, 4.352f)
                arcToRelative(.5f, .5f, 0f, false, false, .623f, .622f)
                lineToRelative(4.353f, -1.32f)
                arcToRelative(2f, 2f, 0f, false, false, .83f, -.497f)
                close()
            }
            lucidePath(strokeWidth) {
                moveToRelative(15f, 5f)
                lineToRelative(4f, 4f)
            }
}

public val LucideIcons.All.PencilDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Pencil: ImageVector
    @Composable get() = PencilDefinition.asImageVector()
