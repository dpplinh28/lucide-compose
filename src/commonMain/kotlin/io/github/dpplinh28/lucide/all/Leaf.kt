package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Leaf") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11f, 20f)
                arcTo(7f, 7f, 0f, false, true, 9.8f, 6.1f)
                curveTo(15.5f, 5f, 17f, 4.48f, 19f, 2f)
                curveToRelative(1f, 2f, 2f, 4.18f, 2f, 8f)
                curveToRelative(0f, 5.5f, -4.78f, 10f, -10f, 10f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(2f, 21f)
                curveToRelative(0f, -3f, 1.85f, -5.36f, 5.08f, -6f)
                curveTo(9.5f, 14.52f, 12f, 13f, 13f, 12f)
            }
}

public val LucideIcons.All.LeafDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Leaf: ImageVector
    @Composable get() = LeafDefinition.asImageVector()
