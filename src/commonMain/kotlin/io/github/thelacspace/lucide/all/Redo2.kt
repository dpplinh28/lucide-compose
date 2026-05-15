package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Redo2") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(15f, 14f)
                lineToRelative(5f, -5f)
                lineToRelative(-5f, -5f)
            }
            lucidePath(strokeWidth) {
                moveTo(20f, 9f)
                horizontalLineTo(9.5f)
                arcTo(5.5f, 5.5f, 0f, false, false, 4f, 14.5f)
                arcTo(5.5f, 5.5f, 0f, false, false, 9.5f, 20f)
                horizontalLineTo(13f)
            }
}

public val LucideIcons.All.Redo2Definition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Redo2: ImageVector
    @Composable get() = Redo2Definition.asImageVector()
