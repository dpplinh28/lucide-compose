package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Turtle") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(12f, 10f)
                lineToRelative(2f, 4f)
                verticalLineToRelative(3f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                verticalLineToRelative(-3f)
                arcToRelative(8f, 8f, 0f, true, false, -16f, 0f)
                verticalLineToRelative(3f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                verticalLineToRelative(-3f)
                lineToRelative(2f, -4f)
                horizontalLineToRelative(4f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(4.82f, 7.9f)
                lineTo(8f, 10f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.18f, 7.9f)
                lineTo(12f, 10f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.93f, 10f)
                horizontalLineTo(20f)
                arcToRelative(2f, 2f, 0f, false, true, 0f, 4f)
                horizontalLineTo(2f)
            }
}

public val LucideIcons.All.TurtleDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Turtle: ImageVector
    @Composable get() = TurtleDefinition.asImageVector()
