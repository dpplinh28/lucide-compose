package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Undo") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3f, 7f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(6f)
            }
            lucidePath(strokeWidth) {
                moveTo(21f, 17f)
                arcToRelative(9f, 9f, 0f, false, false, -9f, -9f)
                arcToRelative(9f, 9f, 0f, false, false, -6f, 2.3f)
                lineTo(3f, 13f)
            }
}

public val LucideIcons.All.UndoDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Undo: ImageVector
    @Composable get() = UndoDefinition.asImageVector()
