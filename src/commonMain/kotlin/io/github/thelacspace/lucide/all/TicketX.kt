package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("TicketX") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2f, 9f)
                arcToRelative(3f, 3f, 0f, false, true, 0f, 6f)
                verticalLineToRelative(2f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(16f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineToRelative(-2f)
                arcToRelative(3f, 3f, 0f, false, true, 0f, -6f)
                verticalLineTo(7f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                close()
            }
            lucidePath(strokeWidth) {
                moveToRelative(9.5f, 14.5f)
                lineToRelative(5f, -5f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(9.5f, 9.5f)
                lineToRelative(5f, 5f)
            }
}

public val LucideIcons.All.TicketXDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.TicketX: ImageVector
    @Composable get() = TicketXDefinition.asImageVector()
