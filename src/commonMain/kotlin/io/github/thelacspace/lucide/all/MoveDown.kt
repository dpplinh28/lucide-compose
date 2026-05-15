package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MoveDown") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(8f, 18f)
                lineTo(12f, 22f)
                lineTo(16f, 18f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 2f)
                verticalLineTo(22f)
            }
}

public val LucideIcons.All.MoveDownDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MoveDown: ImageVector
    @Composable get() = MoveDownDefinition.asImageVector()
