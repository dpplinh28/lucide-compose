package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("TicketPercent") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2f, 9f)
                arcToRelative(3f, 3f, 0f, true, true, 0f, 6f)
                verticalLineToRelative(2f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(16f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineToRelative(-2f)
                arcToRelative(3f, 3f, 0f, true, true, 0f, -6f)
                verticalLineTo(7f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 9f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(15f, 9f)
                lineToRelative(-6f, 6f)
            }
            lucidePath(strokeWidth) {
                moveTo(15f, 15f)
                horizontalLineToRelative(.01f)
            }
}

public val LucideIcons.All.TicketPercentDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.TicketPercent: ImageVector
    @Composable get() = TicketPercentDefinition.asImageVector()
