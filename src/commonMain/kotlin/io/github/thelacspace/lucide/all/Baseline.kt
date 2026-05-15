package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Baseline") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4f, 20f)
                horizontalLineToRelative(16f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(6f, 16f)
                lineToRelative(6f, -12f)
                lineToRelative(6f, 12f)
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 12f)
                horizontalLineToRelative(8f)
            }
}

public val LucideIcons.All.BaselineDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Baseline: ImageVector
    @Composable get() = BaselineDefinition.asImageVector()
