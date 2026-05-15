package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SquareCenterlineDashedVertical") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(21f, 8f)
                verticalLineTo(5f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                horizontalLineTo(5f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(3f)
            }
            lucidePath(strokeWidth) {
                moveTo(21f, 16f)
                verticalLineToRelative(3f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineTo(5f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineToRelative(-3f)
            }
            lucidePath(strokeWidth) {
                moveTo(4f, 12f)
                horizontalLineTo(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(10f, 12f)
                horizontalLineTo(8f)
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 12f)
                horizontalLineToRelative(-2f)
            }
            lucidePath(strokeWidth) {
                moveTo(22f, 12f)
                horizontalLineToRelative(-2f)
            }
}

public val LucideIcons.All.SquareCenterlineDashedVerticalDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SquareCenterlineDashedVertical: ImageVector
    @Composable get() = SquareCenterlineDashedVerticalDefinition.asImageVector()
