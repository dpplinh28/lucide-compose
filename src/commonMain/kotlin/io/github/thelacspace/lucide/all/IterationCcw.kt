package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("IterationCcw") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(16f, 14f)
                lineToRelative(4f, 4f)
                lineToRelative(-4f, 4f)
            }
            lucidePath(strokeWidth) {
                moveTo(20f, 10f)
                arcToRelative(8f, 8f, 0f, true, false, -8f, 8f)
                horizontalLineToRelative(8f)
            }
}

public val LucideIcons.All.IterationCcwDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.IterationCcw: ImageVector
    @Composable get() = IterationCcwDefinition.asImageVector()
