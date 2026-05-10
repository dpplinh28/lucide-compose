package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Lightbulb") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15f, 14f)
                curveToRelative(.2f, -1f, .7f, -1.7f, 1.5f, -2.5f)
                curveToRelative(1f, -.9f, 1.5f, -2.2f, 1.5f, -3.5f)
                arcTo(6f, 6f, 0f, false, false, 6f, 8f)
                curveToRelative(0f, 1f, .2f, 2.2f, 1.5f, 3.5f)
                curveToRelative(.7f, .7f, 1.3f, 1.5f, 1.5f, 2.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 18f)
                horizontalLineToRelative(6f)
            }
            lucidePath(strokeWidth) {
                moveTo(10f, 22f)
                horizontalLineToRelative(4f)
            }
}

public val LucideIcons.All.LightbulbDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Lightbulb: ImageVector
    @Composable get() = LightbulbDefinition.asImageVector()
