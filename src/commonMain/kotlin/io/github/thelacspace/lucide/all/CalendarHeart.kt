package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CalendarHeart") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.127f, 22f)
                horizontalLineTo(5f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineTo(6f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(14f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(5.125f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.62f, 18.8f)
                arcTo(2.25f, 2.25f, 0f, true, true, 18f, 15.836f)
                arcToRelative(2.25f, 2.25f, 0f, true, true, 3.38f, 2.966f)
                lineToRelative(-2.626f, 2.856f)
                arcToRelative(.998f, .998f, 0f, false, true, -1.507f, 0f)
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
}

public val LucideIcons.All.CalendarHeartDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CalendarHeart: ImageVector
    @Composable get() = CalendarHeartDefinition.asImageVector()
