package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Contrast") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0f, 12.0f)
                arcToRelative(10.0f, 10.0f, 0f, true, false, 20.0f, 0f)
                arcToRelative(10.0f, 10.0f, 0f, true, false, -20.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 18f)
                arcToRelative(6f, 6f, 0f, false, false, 0f, -12f)
                verticalLineToRelative(12f)
                close()
            }
}

public val LucideIcons.All.ContrastDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Contrast: ImageVector
    @Composable get() = ContrastDefinition.asImageVector()
