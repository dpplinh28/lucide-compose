package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

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
