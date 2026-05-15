package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ArrowLeft") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(12f, 19f)
                lineToRelative(-7f, -7f)
                lineToRelative(7f, -7f)
            }
            lucidePath(strokeWidth) {
                moveTo(19f, 12f)
                horizontalLineTo(5f)
            }
}

public val LucideIcons.All.ArrowLeftDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ArrowLeft: ImageVector
    @Composable get() = ArrowLeftDefinition.asImageVector()
