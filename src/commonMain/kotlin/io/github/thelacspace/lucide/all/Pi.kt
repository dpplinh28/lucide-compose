package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Pi") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(9f, 4f)
                lineTo(9f, 20f)
            }
            lucidePath(strokeWidth) {
                moveTo(4f, 7f)
                curveToRelative(0f, -1.7f, 1.3f, -3f, 3f, -3f)
                horizontalLineToRelative(13f)
            }
            lucidePath(strokeWidth) {
                moveTo(18f, 20f)
                curveToRelative(-1.7f, 0f, -3f, -1.3f, -3f, -3f)
                verticalLineTo(4f)
            }
}

public val LucideIcons.All.PiDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Pi: ImageVector
    @Composable get() = PiDefinition.asImageVector()
