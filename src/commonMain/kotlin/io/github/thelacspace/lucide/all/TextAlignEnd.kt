package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("TextAlignEnd") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(21f, 5f)
                horizontalLineTo(3f)
            }
            lucidePath(strokeWidth) {
                moveTo(21f, 12f)
                horizontalLineTo(9f)
            }
            lucidePath(strokeWidth) {
                moveTo(21f, 19f)
                horizontalLineTo(7f)
            }
}

public val LucideIcons.All.TextAlignEndDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.TextAlignEnd: ImageVector
    @Composable get() = TextAlignEndDefinition.asImageVector()
