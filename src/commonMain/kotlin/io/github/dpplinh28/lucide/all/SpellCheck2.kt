package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SpellCheck2") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(6f, 16f)
                lineToRelative(6f, -12f)
                lineToRelative(6f, 12f)
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 12f)
                horizontalLineToRelative(8f)
            }
            lucidePath(strokeWidth) {
                moveTo(4f, 21f)
                curveToRelative(1.1f, 0f, 1.1f, -1f, 2.3f, -1f)
                reflectiveCurveToRelative(1.1f, 1f, 2.3f, 1f)
                curveToRelative(1.1f, 0f, 1.1f, -1f, 2.3f, -1f)
                curveToRelative(1.1f, 0f, 1.1f, 1f, 2.3f, 1f)
                curveToRelative(1.1f, 0f, 1.1f, -1f, 2.3f, -1f)
                curveToRelative(1.1f, 0f, 1.1f, 1f, 2.3f, 1f)
                curveToRelative(1.1f, 0f, 1.1f, -1f, 2.3f, -1f)
            }
}

public val LucideIcons.All.SpellCheck2Definition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SpellCheck2: ImageVector
    @Composable get() = SpellCheck2Definition.asImageVector()
