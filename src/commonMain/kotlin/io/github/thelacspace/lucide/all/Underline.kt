package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Underline") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(6f, 4f)
                verticalLineToRelative(6f)
                arcToRelative(6f, 6f, 0f, false, false, 12f, 0f)
                verticalLineTo(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(4f, 20f)
                lineTo(20f, 20f)
            }
}

public val LucideIcons.All.UnderlineDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Underline: ImageVector
    @Composable get() = UnderlineDefinition.asImageVector()
