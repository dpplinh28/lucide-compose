package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CornerUpLeft") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(20f, 20f)
                verticalLineToRelative(-7f)
                arcToRelative(4f, 4f, 0f, false, false, -4f, -4f)
                horizontalLineTo(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 14f)
                lineTo(4f, 9f)
                lineToRelative(5f, -5f)
            }
}

public val LucideIcons.All.CornerUpLeftDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CornerUpLeft: ImageVector
    @Composable get() = CornerUpLeftDefinition.asImageVector()
