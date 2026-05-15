package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Plane") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(17.8f, 19.2f)
                lineTo(16f, 11f)
                lineToRelative(3.5f, -3.5f)
                curveTo(21f, 6f, 21.5f, 4f, 21f, 3f)
                curveToRelative(-1f, -.5f, -3f, 0f, -4.5f, 1.5f)
                lineTo(13f, 8f)
                lineTo(4.8f, 6.2f)
                curveToRelative(-.5f, -.1f, -.9f, .1f, -1.1f, .5f)
                lineToRelative(-.3f, .5f)
                curveToRelative(-.2f, .5f, -.1f, 1f, .3f, 1.3f)
                lineTo(9f, 12f)
                lineToRelative(-2f, 3f)
                horizontalLineTo(4f)
                lineToRelative(-1f, 1f)
                lineToRelative(3f, 2f)
                lineToRelative(2f, 3f)
                lineToRelative(1f, -1f)
                verticalLineToRelative(-3f)
                lineToRelative(3f, -2f)
                lineToRelative(3.5f, 5.3f)
                curveToRelative(.3f, .4f, .8f, .5f, 1.3f, .3f)
                lineToRelative(.5f, -.2f)
                curveToRelative(.4f, -.3f, .6f, -.7f, .5f, -1.2f)
                close()
            }
}

public val LucideIcons.All.PlaneDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Plane: ImageVector
    @Composable get() = PlaneDefinition.asImageVector()
