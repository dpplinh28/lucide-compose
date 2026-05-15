package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Scaling") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 3f)
                horizontalLineTo(5f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(14f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(14f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineToRelative(-7f)
            }
            lucidePath(strokeWidth) {
                moveTo(14f, 15f)
                horizontalLineTo(9f)
                verticalLineToRelative(-5f)
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 3f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(5f)
            }
            lucidePath(strokeWidth) {
                moveTo(21f, 3f)
                lineTo(9f, 15f)
            }
}

public val LucideIcons.All.ScalingDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Scaling: ImageVector
    @Composable get() = ScalingDefinition.asImageVector()
