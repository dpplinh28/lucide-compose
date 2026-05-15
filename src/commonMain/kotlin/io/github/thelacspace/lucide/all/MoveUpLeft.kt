package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MoveUpLeft") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(5f, 11f)
                verticalLineTo(5f)
                horizontalLineTo(11f)
            }
            lucidePath(strokeWidth) {
                moveTo(5f, 5f)
                lineTo(19f, 19f)
            }
}

public val LucideIcons.All.MoveUpLeftDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MoveUpLeft: ImageVector
    @Composable get() = MoveUpLeftDefinition.asImageVector()
