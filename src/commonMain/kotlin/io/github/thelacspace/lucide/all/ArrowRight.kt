package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ArrowRight") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(5f, 12f)
                horizontalLineToRelative(14f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(12f, 5f)
                lineToRelative(7f, 7f)
                lineToRelative(-7f, 7f)
            }
}

public val LucideIcons.All.ArrowRightDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ArrowRight: ImageVector
    @Composable get() = ArrowRightDefinition.asImageVector()
