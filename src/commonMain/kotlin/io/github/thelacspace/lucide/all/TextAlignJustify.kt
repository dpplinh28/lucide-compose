package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("TextAlignJustify") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3f, 5f)
                horizontalLineToRelative(18f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 12f)
                horizontalLineToRelative(18f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 19f)
                horizontalLineToRelative(18f)
            }
}

public val LucideIcons.All.TextAlignJustifyDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.TextAlignJustify: ImageVector
    @Composable get() = TextAlignJustifyDefinition.asImageVector()
