package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Maximize2") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15f, 3f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(6f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(21f, 3f)
                lineToRelative(-7f, 7f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(3f, 21f)
                lineToRelative(7f, -7f)
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 21f)
                horizontalLineTo(3f)
                verticalLineToRelative(-6f)
            }
}

public val LucideIcons.All.Maximize2Definition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Maximize2: ImageVector
    @Composable get() = Maximize2Definition.asImageVector()
