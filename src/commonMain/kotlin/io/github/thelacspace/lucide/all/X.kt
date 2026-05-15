package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("X") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(18f, 6f)
                lineTo(6f, 18f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(6f, 6f)
                lineToRelative(12f, 12f)
            }
}

public val LucideIcons.All.XDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.X: ImageVector
    @Composable get() = XDefinition.asImageVector()
