package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("UnfoldHorizontal") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16f, 12f)
                horizontalLineToRelative(6f)
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 12f)
                horizontalLineTo(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 2f)
                verticalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 8f)
                verticalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 14f)
                verticalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 20f)
                verticalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(19f, 15f)
                lineToRelative(3f, -3f)
                lineToRelative(-3f, -3f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(5f, 9f)
                lineToRelative(-3f, 3f)
                lineToRelative(3f, 3f)
            }
}

public val LucideIcons.All.UnfoldHorizontalDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.UnfoldHorizontal: ImageVector
    @Composable get() = UnfoldHorizontalDefinition.asImageVector()
