package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Variable") { strokeWidth ->
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
            lucidePath(strokeWidth) {
                moveTo(15f, 9f)
                lineTo(9f, 15f)
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 9f)
                lineTo(15f, 15f)
            }
}

public val LucideIcons.All.VariableDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Variable: ImageVector
    @Composable get() = VariableDefinition.asImageVector()
