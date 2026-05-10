package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Parentheses") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(8f, 21f)
                reflectiveCurveToRelative(-4f, -3f, -4f, -9f)
                reflectiveCurveToRelative(4f, -9f, 4f, -9f)
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 3f)
                reflectiveCurveToRelative(4f, 3f, 4f, 9f)
                reflectiveCurveToRelative(-4f, 9f, -4f, 9f)
            }
}

public val LucideIcons.All.ParenthesesDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Parentheses: ImageVector
    @Composable get() = ParenthesesDefinition.asImageVector()
