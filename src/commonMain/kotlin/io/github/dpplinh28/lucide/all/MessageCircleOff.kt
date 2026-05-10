package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MessageCircleOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(2f, 2f)
                lineToRelative(20f, 20f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.93f, 4.929f)
                arcToRelative(10f, 10f, 0f, false, false, -1.938f, 11.412f)
                arcToRelative(2f, 2f, 0f, false, true, .094f, 1.167f)
                lineToRelative(-1.065f, 3.29f)
                arcToRelative(1f, 1f, 0f, false, false, 1.236f, 1.168f)
                lineToRelative(3.413f, -.998f)
                arcToRelative(2f, 2f, 0f, false, true, 1.099f, .092f)
                arcToRelative(10f, 10f, 0f, false, false, 11.302f, -1.989f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.35f, 2.69f)
                arcTo(10f, 10f, 0f, false, true, 21.3f, 15.65f)
            }
}

public val LucideIcons.All.MessageCircleOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MessageCircleOff: ImageVector
    @Composable get() = MessageCircleOffDefinition.asImageVector()
