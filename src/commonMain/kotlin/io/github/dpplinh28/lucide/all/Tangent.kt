package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Tangent") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.0f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, 4.0f, 0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, -4.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.59f, 5.41f)
                lineTo(5.41f, 15.59f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f, 17.0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, 4.0f, 0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, -4.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 22f)
                reflectiveCurveToRelative(-4f, -9f, -1.5f, -11.5f)
                reflectiveCurveTo(22f, 12f, 22f, 12f)
            }
}

public val LucideIcons.All.TangentDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Tangent: ImageVector
    @Composable get() = TangentDefinition.asImageVector()
