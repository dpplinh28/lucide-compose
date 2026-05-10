package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Popsicle") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(18.6f, 14.4f)
                curveToRelative(.8f, -.8f, .8f, -2f, 0f, -2.8f)
                lineToRelative(-8.1f, -8.1f)
                arcToRelative(4.95f, 4.95f, 0f, true, false, -7.1f, 7.1f)
                lineToRelative(8.1f, 8.1f)
                curveToRelative(.9f, .7f, 2.1f, .7f, 2.9f, -.1f)
                close()
            }
            lucidePath(strokeWidth) {
                moveToRelative(22f, 22f)
                lineToRelative(-5.5f, -5.5f)
            }
}

public val LucideIcons.All.PopsicleDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Popsicle: ImageVector
    @Composable get() = PopsicleDefinition.asImageVector()
