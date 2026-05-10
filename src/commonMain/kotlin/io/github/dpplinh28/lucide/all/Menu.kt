package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

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
