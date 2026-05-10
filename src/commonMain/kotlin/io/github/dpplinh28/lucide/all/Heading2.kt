package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Heading2") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4f, 12f)
                horizontalLineToRelative(8f)
            }
            lucidePath(strokeWidth) {
                moveTo(4f, 18f)
                verticalLineTo(6f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 18f)
                verticalLineTo(6f)
            }
            lucidePath(strokeWidth) {
                moveTo(21f, 18f)
                horizontalLineToRelative(-4f)
                curveToRelative(0f, -4f, 4f, -3f, 4f, -6f)
                curveToRelative(0f, -1.5f, -2f, -2.5f, -4f, -1f)
            }
}

public val LucideIcons.All.Heading2Definition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Heading2: ImageVector
    @Composable get() = Heading2Definition.asImageVector()
