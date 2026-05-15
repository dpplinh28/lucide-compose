package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Tractor") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(10f, 11f)
                lineToRelative(11f, .9f)
                arcToRelative(1f, 1f, 0f, false, true, .8f, 1.1f)
                lineToRelative(-.665f, 4.158f)
                arcToRelative(1f, 1f, 0f, false, true, -.988f, .842f)
                horizontalLineTo(20f)
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 18f)
                horizontalLineToRelative(-5f)
            }
            lucidePath(strokeWidth) {
                moveTo(18f, 5f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(5.573f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 4f)
                horizontalLineToRelative(8.129f)
                arcToRelative(1f, 1f, 0f, false, true, .99f, .863f)
                lineTo(13f, 11.246f)
            }
            lucidePath(strokeWidth) {
                moveTo(4f, 11f)
                verticalLineTo(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(7f, 15f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 10.1f)
                verticalLineTo(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f, 18.0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, 4.0f, 0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, -4.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f, 15.0f)
                arcToRelative(5.0f, 5.0f, 0f, true, false, 10.0f, 0f)
                arcToRelative(5.0f, 5.0f, 0f, true, false, -10.0f, 0f)
            }
}

public val LucideIcons.All.TractorDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Tractor: ImageVector
    @Composable get() = TractorDefinition.asImageVector()
