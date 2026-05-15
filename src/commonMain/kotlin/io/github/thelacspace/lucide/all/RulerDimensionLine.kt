package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("RulerDimensionLine") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10f, 15f)
                verticalLineToRelative(-3f)
            }
            lucidePath(strokeWidth) {
                moveTo(14f, 15f)
                verticalLineToRelative(-3f)
            }
            lucidePath(strokeWidth) {
                moveTo(18f, 15f)
                verticalLineToRelative(-3f)
            }
            lucidePath(strokeWidth) {
                moveTo(2f, 8f)
                verticalLineTo(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(22f, 6f)
                horizontalLineTo(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(22f, 8f)
                verticalLineTo(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(6f, 15f)
                verticalLineToRelative(-3f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f, 12.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, 2.0f, 0.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, -2.0f, 0.0f)
                horizontalLineToRelative(-16.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, -2.0f, -0.0f)
                verticalLineToRelative(-8.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, 2.0f, -0.0f)
                close()
            }
}

public val LucideIcons.All.RulerDimensionLineDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.RulerDimensionLine: ImageVector
    @Composable get() = RulerDimensionLineDefinition.asImageVector()
