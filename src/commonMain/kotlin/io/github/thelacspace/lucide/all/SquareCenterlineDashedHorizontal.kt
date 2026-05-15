package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SquareCenterlineDashedHorizontal") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(8f, 3f)
                horizontalLineTo(5f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 1.1f, .9f, 2f, 2f, 2f)
                horizontalLineToRelative(3f)
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 3f)
                horizontalLineToRelative(3f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(14f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineToRelative(-3f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 20f)
                verticalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 14f)
                verticalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 8f)
                verticalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 2f)
                verticalLineToRelative(2f)
            }
}

public val LucideIcons.All.SquareCenterlineDashedHorizontalDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SquareCenterlineDashedHorizontal: ImageVector
    @Composable get() = SquareCenterlineDashedHorizontalDefinition.asImageVector()
