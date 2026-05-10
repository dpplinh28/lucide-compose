package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Droplet") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 22f)
                arcToRelative(7f, 7f, 0f, false, false, 7f, -7f)
                curveToRelative(0f, -2f, -1f, -3.9f, -3f, -5.5f)
                reflectiveCurveToRelative(-3.5f, -4f, -4f, -6.5f)
                curveToRelative(-.5f, 2.5f, -2f, 4.9f, -4f, 6.5f)
                curveTo(6f, 11.1f, 5f, 13f, 5f, 15f)
                arcToRelative(7f, 7f, 0f, false, false, 7f, 7f)
                close()
            }
}

public val LucideIcons.All.DropletDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Droplet: ImageVector
    @Composable get() = DropletDefinition.asImageVector()
