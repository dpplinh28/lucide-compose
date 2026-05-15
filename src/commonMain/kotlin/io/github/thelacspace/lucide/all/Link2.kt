package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Link2") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(9f, 17f)
                horizontalLineTo(7f)
                arcTo(5f, 5f, 0f, false, true, 7f, 7f)
                horizontalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(15f, 7f)
                horizontalLineToRelative(2f)
                arcToRelative(5f, 5f, 0f, true, true, 0f, 10f)
                horizontalLineToRelative(-2f)
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 12f)
                lineTo(16f, 12f)
            }
}

public val LucideIcons.All.Link2Definition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Link2: ImageVector
    @Composable get() = Link2Definition.asImageVector()
