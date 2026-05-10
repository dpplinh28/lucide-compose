package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("TramFront") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(6.0f, 3.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, 2.0f, 0.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, -2.0f, 0.0f)
                horizontalLineToRelative(-12.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, -2.0f, -0.0f)
                verticalLineToRelative(-16.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, 2.0f, -0.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(4f, 11f)
                horizontalLineToRelative(16f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 3f)
                verticalLineToRelative(8f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(8f, 19f)
                lineToRelative(-2f, 3f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(18f, 22f)
                lineToRelative(-2f, -3f)
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 15f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 15f)
                horizontalLineToRelative(.01f)
            }
}

public val LucideIcons.All.TramFrontDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.TramFront: ImageVector
    @Composable get() = TramFrontDefinition.asImageVector()
