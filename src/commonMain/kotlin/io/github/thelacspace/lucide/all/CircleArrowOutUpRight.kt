package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CircleArrowOutUpRight") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(22f, 12f)
                arcTo(10f, 10f, 0f, true, true, 12f, 2f)
            }
            lucidePath(strokeWidth) {
                moveTo(22f, 2f)
                lineTo(12f, 12f)
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 2f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(6f)
            }
}

public val LucideIcons.All.CircleArrowOutUpRightDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CircleArrowOutUpRight: ImageVector
    @Composable get() = CircleArrowOutUpRightDefinition.asImageVector()
