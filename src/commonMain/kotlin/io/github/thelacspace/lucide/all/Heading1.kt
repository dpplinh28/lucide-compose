package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Heading1") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4f, 12f)
                horizontalLineToRelative(8f)
            }
            lucidePath(strokeWidth) {
                moveTo(4f, 18f)
                verticalLineTo(6f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 18f)
                verticalLineTo(6f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(17f, 12f)
                lineToRelative(3f, -2f)
                verticalLineToRelative(8f)
            }
}

public val LucideIcons.All.Heading1Definition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Heading1: ImageVector
    @Composable get() = Heading1Definition.asImageVector()
