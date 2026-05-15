package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CalendarRange") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(5.0f, 4.0f)
                horizontalLineToRelative(14.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, 2.0f, 0.0f)
                verticalLineToRelative(18.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, -2.0f, 0.0f)
                horizontalLineToRelative(-14.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, -2.0f, -0.0f)
                verticalLineToRelative(-18.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, 2.0f, -0.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 2f)
                verticalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 10f)
                horizontalLineToRelative(18f)
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 2f)
                verticalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(17f, 14f)
                horizontalLineToRelative(-6f)
            }
            lucidePath(strokeWidth) {
                moveTo(13f, 18f)
                horizontalLineTo(7f)
            }
            lucidePath(strokeWidth) {
                moveTo(7f, 14f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(17f, 18f)
                horizontalLineToRelative(.01f)
            }
}

public val LucideIcons.All.CalendarRangeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CalendarRange: ImageVector
    @Composable get() = CalendarRangeDefinition.asImageVector()
