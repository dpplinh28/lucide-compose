package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MoveUp") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(8f, 6f)
                lineTo(12f, 2f)
                lineTo(16f, 6f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 2f)
                verticalLineTo(22f)
            }
}

public val LucideIcons.All.MoveUpDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MoveUp: ImageVector
    @Composable get() = MoveUpDefinition.asImageVector()
