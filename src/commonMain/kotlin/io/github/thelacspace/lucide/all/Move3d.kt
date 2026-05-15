package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Move3d") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(5f, 3f)
                verticalLineToRelative(16f)
                horizontalLineToRelative(16f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(5f, 19f)
                lineToRelative(6f, -6f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(2f, 6f)
                lineToRelative(3f, -3f)
                lineToRelative(3f, 3f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(18f, 16f)
                lineToRelative(3f, 3f)
                lineToRelative(-3f, 3f)
            }
}

public val LucideIcons.All.Move3dDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Move3d: ImageVector
    @Composable get() = Move3dDefinition.asImageVector()
