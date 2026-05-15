package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Heading") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(6f, 12f)
                horizontalLineToRelative(12f)
            }
            lucidePath(strokeWidth) {
                moveTo(6f, 20f)
                verticalLineTo(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(18f, 20f)
                verticalLineTo(4f)
            }
}

public val LucideIcons.All.HeadingDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Heading: ImageVector
    @Composable get() = HeadingDefinition.asImageVector()
