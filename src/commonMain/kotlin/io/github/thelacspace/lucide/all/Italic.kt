package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Italic") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(19f, 4f)
                lineTo(10f, 4f)
            }
            lucidePath(strokeWidth) {
                moveTo(14f, 20f)
                lineTo(5f, 20f)
            }
            lucidePath(strokeWidth) {
                moveTo(15f, 4f)
                lineTo(9f, 20f)
            }
}

public val LucideIcons.All.ItalicDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Italic: ImageVector
    @Composable get() = ItalicDefinition.asImageVector()
