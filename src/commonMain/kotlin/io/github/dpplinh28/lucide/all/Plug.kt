package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Plug") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 22f)
                verticalLineToRelative(-5f)
            }
            lucidePath(strokeWidth) {
                moveTo(15f, 8f)
                verticalLineTo(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(17f, 8f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(4f)
                arcToRelative(4f, 4f, 0f, false, true, -4f, 4f)
                horizontalLineToRelative(-4f)
                arcToRelative(4f, 4f, 0f, false, true, -4f, -4f)
                verticalLineTo(9f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 8f)
                verticalLineTo(2f)
            }
}

public val LucideIcons.All.PlugDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Plug: ImageVector
    @Composable get() = PlugDefinition.asImageVector()
