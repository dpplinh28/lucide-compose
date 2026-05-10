package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("PenLine") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(13f, 21f)
                horizontalLineToRelative(8f)
            }
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
}

public val LucideIcons.All.PenLineDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.PenLine: ImageVector
    @Composable get() = PenLineDefinition.asImageVector()
