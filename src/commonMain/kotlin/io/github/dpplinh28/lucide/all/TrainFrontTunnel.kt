package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("TrainFrontTunnel") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2f, 22f)
                verticalLineTo(12f)
                arcToRelative(10f, 10f, 0f, true, true, 20f, 0f)
                verticalLineToRelative(10f)
            }
            lucidePath(strokeWidth) {
                moveTo(15f, 6.8f)
                verticalLineToRelative(1.4f)
                arcToRelative(3f, 2.8f, 0f, true, true, -6f, 0f)
                verticalLineTo(6.8f)
            }
            lucidePath(strokeWidth) {
                moveTo(10f, 15f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(14f, 15f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(10f, 19f)
                arcToRelative(4f, 4f, 0f, false, true, -4f, -4f)
                verticalLineToRelative(-3f)
                arcToRelative(6f, 6f, 0f, true, true, 12f, 0f)
                verticalLineToRelative(3f)
                arcToRelative(4f, 4f, 0f, false, true, -4f, 4f)
                close()
            }
            lucidePath(strokeWidth) {
                moveToRelative(9f, 19f)
                lineToRelative(-2f, 3f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(15f, 19f)
                lineToRelative(2f, 3f)
            }
}

public val LucideIcons.All.TrainFrontTunnelDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.TrainFrontTunnel: ImageVector
    @Composable get() = TrainFrontTunnelDefinition.asImageVector()
