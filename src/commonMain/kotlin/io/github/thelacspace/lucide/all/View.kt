package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("View") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(21f, 17f)
                verticalLineToRelative(2f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineTo(5f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineToRelative(-2f)
            }
            lucidePath(strokeWidth) {
                moveTo(21f, 7f)
                verticalLineTo(5f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                horizontalLineTo(5f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(11.0f, 12.0f)
                arcToRelative(1.0f, 1.0f, 0f, true, false, 2.0f, 0f)
                arcToRelative(1.0f, 1.0f, 0f, true, false, -2.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.944f, 12.33f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -.66f)
                arcToRelative(7.5f, 7.5f, 0f, false, false, -13.888f, 0f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, .66f)
                arcToRelative(7.5f, 7.5f, 0f, false, false, 13.888f, 0f)
            }
}

public val LucideIcons.All.ViewDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.View: ImageVector
    @Composable get() = ViewDefinition.asImageVector()
