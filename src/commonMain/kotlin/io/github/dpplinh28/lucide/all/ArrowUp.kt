package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ArrowUp") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(5f, 12f)
                lineToRelative(7f, -7f)
                lineToRelative(7f, 7f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 19f)
                verticalLineTo(5f)
            }
}

public val LucideIcons.All.ArrowUpDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ArrowUp: ImageVector
    @Composable get() = ArrowUpDefinition.asImageVector()
