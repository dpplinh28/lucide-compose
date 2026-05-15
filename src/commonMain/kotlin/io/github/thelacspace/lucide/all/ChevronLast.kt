package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ChevronLast") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(7f, 18f)
                lineToRelative(6f, -6f)
                lineToRelative(-6f, -6f)
            }
            lucidePath(strokeWidth) {
                moveTo(17f, 6f)
                verticalLineToRelative(12f)
            }
}

public val LucideIcons.All.ChevronLastDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ChevronLast: ImageVector
    @Composable get() = ChevronLastDefinition.asImageVector()
