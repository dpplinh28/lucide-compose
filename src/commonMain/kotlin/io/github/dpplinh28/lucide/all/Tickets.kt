package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Tickets") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(3.173f, 8.18f)
                lineToRelative(11f, -5f)
                arcToRelative(2f, 2f, 0f, false, true, 2.647f, .993f)
                lineTo(18.56f, 8f)
            }
            lucidePath(strokeWidth) {
                moveTo(6f, 10f)
                verticalLineTo(8f)
            }
            lucidePath(strokeWidth) {
                moveTo(6f, 14f)
                verticalLineToRelative(1f)
            }
            lucidePath(strokeWidth) {
                moveTo(6f, 19f)
                verticalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f, 8.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, 2.0f, 0.0f)
                verticalLineToRelative(13.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, -2.0f, 0.0f)
                horizontalLineToRelative(-16.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, -2.0f, -0.0f)
                verticalLineToRelative(-13.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, 2.0f, -0.0f)
                close()
            }
}

public val LucideIcons.All.TicketsDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Tickets: ImageVector
    @Composable get() = TicketsDefinition.asImageVector()
