package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("UnfoldVertical") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 22f)
                verticalLineToRelative(-6f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 8f)
                verticalLineTo(2f)
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
            lucidePath(strokeWidth) {
                moveToRelative(15f, 19f)
                lineToRelative(-3f, 3f)
                lineToRelative(-3f, -3f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(15f, 5f)
                lineToRelative(-3f, -3f)
                lineToRelative(-3f, 3f)
            }
}

public val LucideIcons.All.UnfoldVerticalDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.UnfoldVertical: ImageVector
    @Composable get() = UnfoldVerticalDefinition.asImageVector()
