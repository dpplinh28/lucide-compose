package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

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
