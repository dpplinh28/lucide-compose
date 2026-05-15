package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Calendars") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 2f)
                verticalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.726f, 21.01f)
                arcTo(2f, 2f, 0f, false, true, 14f, 22f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineTo(10f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
            }
            lucidePath(strokeWidth) {
                moveTo(18f, 2f)
                verticalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(2f, 13f)
                horizontalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 8f)
                horizontalLineToRelative(14f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f, 3.0f)
                horizontalLineToRelative(10.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, 2.0f, 0.0f)
                verticalLineToRelative(14.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, -2.0f, 0.0f)
                horizontalLineToRelative(-10.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, -2.0f, -0.0f)
                verticalLineToRelative(-14.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, 2.0f, -0.0f)
                close()
            }
}

public val LucideIcons.All.CalendarsDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Calendars: ImageVector
    @Composable get() = CalendarsDefinition.asImageVector()
