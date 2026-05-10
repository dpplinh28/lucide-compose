package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Minimize2") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(14f, 10f)
                lineToRelative(7f, -7f)
            }
            lucidePath(strokeWidth) {
                moveTo(20f, 10f)
                horizontalLineToRelative(-6f)
                verticalLineTo(4f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(3f, 21f)
                lineToRelative(7f, -7f)
            }
            lucidePath(strokeWidth) {
                moveTo(4f, 14f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(6f)
            }
}

public val LucideIcons.All.Minimize2Definition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Minimize2: ImageVector
    @Composable get() = Minimize2Definition.asImageVector()
