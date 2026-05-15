package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Cannabis") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 22f)
                verticalLineToRelative(-4f)
            }
            lucidePath(strokeWidth) {
                moveTo(7f, 12f)
                curveToRelative(-1.5f, 0f, -4.5f, 1.5f, -5f, 3f)
                curveToRelative(3.5f, 1.5f, 6f, 1f, 6f, 1f)
                curveToRelative(-1.5f, 1.5f, -2f, 3.5f, -2f, 5f)
                curveToRelative(2.5f, 0f, 4.5f, -1.5f, 6f, -3f)
                curveToRelative(1.5f, 1.5f, 3.5f, 3f, 6f, 3f)
                curveToRelative(0f, -1.5f, -.5f, -3.5f, -2f, -5f)
                curveToRelative(0f, 0f, 2.5f, .5f, 6f, -1f)
                curveToRelative(-.5f, -1.5f, -3.5f, -3f, -5f, -3f)
                curveToRelative(1.5f, -1f, 4f, -4f, 4f, -6f)
                curveToRelative(-2.5f, 0f, -5.5f, 1.5f, -7f, 3f)
                curveToRelative(0f, -2.5f, -.5f, -5f, -2f, -7f)
                curveToRelative(-1.5f, 2f, -2f, 4.5f, -2f, 7f)
                curveToRelative(-1.5f, -1.5f, -4.5f, -3f, -7f, -3f)
                curveToRelative(0f, 2f, 2.5f, 5f, 4f, 6f)
            }
}

public val LucideIcons.All.CannabisDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Cannabis: ImageVector
    @Composable get() = CannabisDefinition.asImageVector()
