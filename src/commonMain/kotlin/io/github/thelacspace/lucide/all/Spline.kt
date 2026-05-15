package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Spline") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(17.0f, 5.0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, 4.0f, 0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, -4.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f, 19.0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, 4.0f, 0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, -4.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(5f, 17f)
                arcTo(12f, 12f, 0f, false, true, 17f, 5f)
            }
}

public val LucideIcons.All.SplineDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Spline: ImageVector
    @Composable get() = SplineDefinition.asImageVector()
