package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("LampWallDown") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(19.929f, 18.629f)
                arcTo(1f, 1f, 0f, false, true, 19f, 20f)
                horizontalLineTo(9f)
                arcToRelative(1f, 1f, 0f, false, true, -.928f, -1.371f)
                lineToRelative(2f, -5f)
                arcTo(1f, 1f, 0f, false, true, 11f, 13f)
                horizontalLineToRelative(6f)
                arcToRelative(1f, 1f, 0f, false, true, .928f, .629f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(6f, 3f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(2f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineTo(5f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                verticalLineTo(4f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 6f)
                horizontalLineToRelative(4f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(5f)
            }
}

public val LucideIcons.All.LampWallDownDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.LampWallDown: ImageVector
    @Composable get() = LampWallDownDefinition.asImageVector()
