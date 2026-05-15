package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Group") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3f, 7f)
                verticalLineTo(5f)
                curveToRelative(0f, -1.1f, .9f, -2f, 2f, -2f)
                horizontalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(17f, 3f)
                horizontalLineToRelative(2f)
                curveToRelative(1.1f, 0f, 2f, .9f, 2f, 2f)
                verticalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(21f, 17f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 1.1f, -.9f, 2f, -2f, 2f)
                horizontalLineToRelative(-2f)
            }
            lucidePath(strokeWidth) {
                moveTo(7f, 21f)
                horizontalLineTo(5f)
                curveToRelative(-1.1f, 0f, -2f, -.9f, -2f, -2f)
                verticalLineToRelative(-2f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f, 7.0f)
                horizontalLineToRelative(5.0f)
                arcToRelative(1.0f, 0.0f, 0f, false, true, 1.0f, 0.0f)
                verticalLineToRelative(5.0f)
                arcToRelative(1.0f, 0.0f, 0f, false, true, -1.0f, 0.0f)
                horizontalLineToRelative(-5.0f)
                arcToRelative(1.0f, 0.0f, 0f, false, true, -1.0f, -0.0f)
                verticalLineToRelative(-5.0f)
                arcToRelative(1.0f, 0.0f, 0f, false, true, 1.0f, -0.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(11.0f, 12.0f)
                horizontalLineToRelative(5.0f)
                arcToRelative(1.0f, 0.0f, 0f, false, true, 1.0f, 0.0f)
                verticalLineToRelative(5.0f)
                arcToRelative(1.0f, 0.0f, 0f, false, true, -1.0f, 0.0f)
                horizontalLineToRelative(-5.0f)
                arcToRelative(1.0f, 0.0f, 0f, false, true, -1.0f, -0.0f)
                verticalLineToRelative(-5.0f)
                arcToRelative(1.0f, 0.0f, 0f, false, true, 1.0f, -0.0f)
                close()
            }
}

public val LucideIcons.All.GroupDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Group: ImageVector
    @Composable get() = GroupDefinition.asImageVector()
