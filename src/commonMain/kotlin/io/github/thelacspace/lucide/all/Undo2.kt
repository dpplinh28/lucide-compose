package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Undo2") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(9f, 14f)
                lineTo(4f, 9f)
                lineToRelative(5f, -5f)
            }
            lucidePath(strokeWidth) {
                moveTo(4f, 9f)
                horizontalLineToRelative(10.5f)
                arcToRelative(5.5f, 5.5f, 0f, false, true, 5.5f, 5.5f)
                arcToRelative(5.5f, 5.5f, 0f, false, true, -5.5f, 5.5f)
                horizontalLineTo(11f)
            }
}

public val LucideIcons.All.Undo2Definition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Undo2: ImageVector
    @Composable get() = Undo2Definition.asImageVector()
