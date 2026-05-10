package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("RouteOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3.0f, 19.0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, 6.0f, 0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, -6.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 19f)
                horizontalLineToRelative(8.5f)
                curveToRelative(.4f, 0f, .9f, -.1f, 1.3f, -.2f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.2f, 5.2f)
                arcTo(3.5f, 3.53f, 0f, false, false, 6.5f, 12f)
                horizontalLineTo(12f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(2f, 2f)
                lineToRelative(20f, 20f)
            }
            lucidePath(strokeWidth) {
                moveTo(21f, 15.3f)
                arcToRelative(3.5f, 3.5f, 0f, false, false, -3.3f, -3.3f)
            }
            lucidePath(strokeWidth) {
                moveTo(15f, 5f)
                horizontalLineToRelative(-4.3f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f, 5.0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, 6.0f, 0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, -6.0f, 0f)
            }
}

public val LucideIcons.All.RouteOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.RouteOff: ImageVector
    @Composable get() = RouteOffDefinition.asImageVector()
