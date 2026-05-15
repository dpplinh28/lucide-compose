package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MessageCircleWarning") { strokeWidth ->
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
                moveTo(12f, 8f)
                verticalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 16f)
                horizontalLineToRelative(.01f)
            }
}

public val LucideIcons.All.MessageCircleWarningDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MessageCircleWarning: ImageVector
    @Composable get() = MessageCircleWarningDefinition.asImageVector()
