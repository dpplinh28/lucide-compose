package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SquaresIntersect") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10f, 22f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
            }
            lucidePath(strokeWidth) {
                moveTo(14f, 2f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 22f)
                horizontalLineToRelative(-2f)
            }
            lucidePath(strokeWidth) {
                moveTo(2f, 10f)
                verticalLineTo(8f)
            }
            lucidePath(strokeWidth) {
                moveTo(2f, 4f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
            }
            lucidePath(strokeWidth) {
                moveTo(20f, 8f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
            }
            lucidePath(strokeWidth) {
                moveTo(22f, 14f)
                verticalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(22f, 20f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
            }
            lucidePath(strokeWidth) {
                moveTo(4f, 16f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 10f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(5f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(5f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineTo(9f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 2f)
                horizontalLineToRelative(2f)
            }
}

public val LucideIcons.All.SquaresIntersectDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SquaresIntersect: ImageVector
    @Composable get() = SquaresIntersectDefinition.asImageVector()
