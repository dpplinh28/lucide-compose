package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SquareDashedKanban") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(8f, 7f)
                verticalLineToRelative(7f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 7f)
                verticalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 7f)
                verticalLineToRelative(9f)
            }
            lucidePath(strokeWidth) {
                moveTo(5f, 3f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 3f)
                horizontalLineToRelative(1f)
            }
            lucidePath(strokeWidth) {
                moveTo(14f, 3f)
                horizontalLineToRelative(1f)
            }
            lucidePath(strokeWidth) {
                moveTo(19f, 3f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
            }
            lucidePath(strokeWidth) {
                moveTo(21f, 9f)
                verticalLineToRelative(1f)
            }
            lucidePath(strokeWidth) {
                moveTo(21f, 14f)
                verticalLineToRelative(1f)
            }
            lucidePath(strokeWidth) {
                moveTo(21f, 19f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
            }
            lucidePath(strokeWidth) {
                moveTo(14f, 21f)
                horizontalLineToRelative(1f)
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 21f)
                horizontalLineToRelative(1f)
            }
            lucidePath(strokeWidth) {
                moveTo(5f, 21f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 14f)
                verticalLineToRelative(1f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 9f)
                verticalLineToRelative(1f)
            }
}

public val LucideIcons.All.SquareDashedKanbanDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SquareDashedKanban: ImageVector
    @Composable get() = SquareDashedKanbanDefinition.asImageVector()
