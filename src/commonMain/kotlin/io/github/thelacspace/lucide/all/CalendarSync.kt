package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CalendarSync") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11f, 10f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(11f, 14f)
                lineToRelative(1.535f, -1.605f)
                arcToRelative(5f, 5f, 0f, false, true, 8f, 1.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 2f)
                verticalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(21f, 18f)
                lineToRelative(-1.535f, 1.605f)
                arcToRelative(5f, 5f, 0f, false, true, -8f, -1.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(21f, 22f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-4f)
            }
            lucidePath(strokeWidth) {
                moveTo(21f, 8.5f)
                verticalLineTo(6f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                horizontalLineTo(5f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(14f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(4.3f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 10f)
                horizontalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 2f)
                verticalLineToRelative(4f)
            }
}

public val LucideIcons.All.CalendarSyncDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CalendarSync: ImageVector
    @Composable get() = CalendarSyncDefinition.asImageVector()
