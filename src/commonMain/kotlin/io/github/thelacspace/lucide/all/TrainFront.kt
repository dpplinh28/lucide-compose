package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("TrainFront") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(8f, 3.1f)
                verticalLineTo(7f)
                arcToRelative(4f, 4f, 0f, false, false, 8f, 0f)
                verticalLineTo(3.1f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(9f, 15f)
                lineToRelative(-1f, -1f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(15f, 15f)
                lineToRelative(1f, -1f)
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 19f)
                curveToRelative(-2.8f, 0f, -5f, -2.2f, -5f, -5f)
                verticalLineToRelative(-4f)
                arcToRelative(8f, 8f, 0f, false, true, 16f, 0f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 2.8f, -2.2f, 5f, -5f, 5f)
                close()
            }
            lucidePath(strokeWidth) {
                moveToRelative(8f, 19f)
                lineToRelative(-2f, 3f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(16f, 19f)
                lineToRelative(2f, 3f)
            }
}

public val LucideIcons.All.TrainFrontDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.TrainFront: ImageVector
    @Composable get() = TrainFrontDefinition.asImageVector()
