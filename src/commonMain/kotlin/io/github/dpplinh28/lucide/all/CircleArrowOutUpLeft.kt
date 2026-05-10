package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

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
