package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MessageCircleHeart") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.992f, 16.342f)
                arcToRelative(2f, 2f, 0f, false, true, .094f, 1.167f)
                lineToRelative(-1.065f, 3.29f)
                arcToRelative(1f, 1f, 0f, false, false, 1.236f, 1.168f)
                lineToRelative(3.413f, -.998f)
                arcToRelative(2f, 2f, 0f, false, true, 1.099f, .092f)
                arcToRelative(10f, 10f, 0f, true, false, -4.777f, -4.719f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.828f, 13.07f)
                arcTo(3f, 3f, 0f, false, true, 12f, 8.764f)
                arcToRelative(3f, 3f, 0f, false, true, 5.004f, 2.224f)
                arcToRelative(3f, 3f, 0f, false, true, -.832f, 2.083f)
                lineToRelative(-3.447f, 3.62f)
                arcToRelative(1f, 1f, 0f, false, true, -1.45f, -.001f)
                close()
            }
}

public val LucideIcons.All.MessageCircleHeartDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MessageCircleHeart: ImageVector
    @Composable get() = MessageCircleHeartDefinition.asImageVector()
