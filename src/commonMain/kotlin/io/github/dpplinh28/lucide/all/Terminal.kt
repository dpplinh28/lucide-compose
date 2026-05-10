package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

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
