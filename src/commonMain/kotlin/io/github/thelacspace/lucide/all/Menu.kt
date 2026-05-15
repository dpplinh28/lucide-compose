package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Menu") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4f, 5f)
                horizontalLineToRelative(16f)
            }
            lucidePath(strokeWidth) {
                moveTo(4f, 12f)
                horizontalLineToRelative(16f)
            }
            lucidePath(strokeWidth) {
                moveTo(4f, 19f)
                horizontalLineToRelative(16f)
            }
}

public val LucideIcons.All.MenuDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Menu: ImageVector
    @Composable get() = MenuDefinition.asImageVector()
