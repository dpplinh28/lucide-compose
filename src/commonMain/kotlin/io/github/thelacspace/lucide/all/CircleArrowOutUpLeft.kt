package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CircleArrowOutUpLeft") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2f, 8f)
                verticalLineTo(2f)
                horizontalLineToRelative(6f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(2f, 2f)
                lineToRelative(10f, 10f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 2f)
                arcTo(10f, 10f, 0f, true, true, 2f, 12f)
            }
}

public val LucideIcons.All.CircleArrowOutUpLeftDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CircleArrowOutUpLeft: ImageVector
    @Composable get() = CircleArrowOutUpLeftDefinition.asImageVector()
