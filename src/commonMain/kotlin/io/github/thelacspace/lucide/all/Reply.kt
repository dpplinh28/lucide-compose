package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Reply") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(20f, 18f)
                verticalLineToRelative(-2f)
                arcToRelative(4f, 4f, 0f, false, false, -4f, -4f)
                horizontalLineTo(4f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(9f, 17f)
                lineToRelative(-5f, -5f)
                lineToRelative(5f, -5f)
            }
}

public val LucideIcons.All.ReplyDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Reply: ImageVector
    @Composable get() = ReplyDefinition.asImageVector()
