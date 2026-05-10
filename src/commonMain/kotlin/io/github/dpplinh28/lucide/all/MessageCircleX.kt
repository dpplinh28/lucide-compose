package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MessageCircleX") { strokeWidth ->
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
                moveToRelative(15f, 9f)
                lineToRelative(-6f, 6f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(9f, 9f)
                lineToRelative(6f, 6f)
            }
}

public val LucideIcons.All.MessageCircleXDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MessageCircleX: ImageVector
    @Composable get() = MessageCircleXDefinition.asImageVector()
