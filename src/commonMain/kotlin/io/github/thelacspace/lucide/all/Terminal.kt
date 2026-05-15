package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Terminal") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 19f)
                horizontalLineToRelative(8f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(4f, 17f)
                lineToRelative(6f, -6f)
                lineToRelative(-6f, -6f)
            }
}

public val LucideIcons.All.TerminalDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Terminal: ImageVector
    @Composable get() = TerminalDefinition.asImageVector()
