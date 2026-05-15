package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Heading6") { strokeWidth ->
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
                moveTo(17.0f, 16.0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, 4.0f, 0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, -4.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(20f, 10f)
                curveToRelative(-2f, 2f, -3f, 3.5f, -3f, 6f)
            }
}

public val LucideIcons.All.Heading6Definition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Heading6: ImageVector
    @Composable get() = Heading6Definition.asImageVector()
