package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ClipboardList") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(9.0f, 2.0f)
                horizontalLineToRelative(6.0f)
                arcToRelative(1.0f, 1.0f, 0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0f, false, true, -1.0f, 1.0f)
                horizontalLineToRelative(-6.0f)
                arcToRelative(1.0f, 1.0f, 0f, false, true, -1.0f, -1.0f)
                verticalLineToRelative(-2.0f)
                arcToRelative(1.0f, 1.0f, 0f, false, true, 1.0f, -1.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 4f)
                horizontalLineToRelative(2f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(14f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineTo(6f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineTo(6f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 11f)
                horizontalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 16f)
                horizontalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 11f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 16f)
                horizontalLineToRelative(.01f)
            }
}

public val LucideIcons.All.ClipboardListDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ClipboardList: ImageVector
    @Composable get() = ClipboardListDefinition.asImageVector()
