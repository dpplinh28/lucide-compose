package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("RadioReceiver") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(5f, 16f)
                verticalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(19f, 16f)
                verticalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f, 8.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, 2.0f, 0.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, -2.0f, 0.0f)
                horizontalLineToRelative(-16.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, -2.0f, -0.0f)
                verticalLineToRelative(-8.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, 2.0f, -0.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(18f, 12f)
                horizontalLineToRelative(.01f)
            }
}

public val LucideIcons.All.RadioReceiverDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.RadioReceiver: ImageVector
    @Composable get() = RadioReceiverDefinition.asImageVector()
