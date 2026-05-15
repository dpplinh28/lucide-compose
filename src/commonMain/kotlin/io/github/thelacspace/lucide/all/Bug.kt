package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Bug") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 20f)
                verticalLineToRelative(-9f)
            }
            lucidePath(strokeWidth) {
                moveTo(14f, 7f)
                arcToRelative(4f, 4f, 0f, false, true, 4f, 4f)
                verticalLineToRelative(3f)
                arcToRelative(6f, 6f, 0f, false, true, -12f, 0f)
                verticalLineToRelative(-3f)
                arcToRelative(4f, 4f, 0f, false, true, 4f, -4f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(14.12f, 3.88f)
                lineTo(16f, 2f)
            }
            lucidePath(strokeWidth) {
                moveTo(21f, 21f)
                arcToRelative(4f, 4f, 0f, false, false, -3.81f, -4f)
            }
            lucidePath(strokeWidth) {
                moveTo(21f, 5f)
                arcToRelative(4f, 4f, 0f, false, true, -3.55f, 3.97f)
            }
            lucidePath(strokeWidth) {
                moveTo(22f, 13f)
                horizontalLineToRelative(-4f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 21f)
                arcToRelative(4f, 4f, 0f, false, true, 3.81f, -4f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 5f)
                arcToRelative(4f, 4f, 0f, false, false, 3.55f, 3.97f)
            }
            lucidePath(strokeWidth) {
                moveTo(6f, 13f)
                horizontalLineTo(2f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(8f, 2f)
                lineToRelative(1.88f, 1.88f)
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 7.13f)
                verticalLineTo(6f)
                arcToRelative(3f, 3f, 0f, true, true, 6f, 0f)
                verticalLineToRelative(1.13f)
            }
}

public val LucideIcons.All.BugDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Bug: ImageVector
    @Composable get() = BugDefinition.asImageVector()
