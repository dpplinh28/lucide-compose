package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("DropletOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(18.715f, 13.186f)
                curveTo(18.29f, 11.858f, 17.384f, 10.607f, 16f, 9.5f)
                curveToRelative(-2f, -1.6f, -3.5f, -4f, -4f, -6.5f)
                arcToRelative(10.7f, 10.7f, 0f, false, true, -.884f, 2.586f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(2f, 2f)
                lineToRelative(20f, 20f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.795f, 8.797f)
                arcTo(11f, 11f, 0f, false, true, 8f, 9.5f)
                curveTo(6f, 11.1f, 5f, 13f, 5f, 15f)
                arcToRelative(7f, 7f, 0f, false, false, 13.222f, 3.208f)
            }
}

public val LucideIcons.All.DropletOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.DropletOff: ImageVector
    @Composable get() = DropletOffDefinition.asImageVector()
