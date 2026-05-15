package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Grid2x2Plus") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 3f)
                verticalLineToRelative(17f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                horizontalLineTo(5f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineTo(5f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(14f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(6f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                horizontalLineTo(3f)
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 19f)
                horizontalLineToRelative(6f)
            }
            lucidePath(strokeWidth) {
                moveTo(19f, 22f)
                verticalLineToRelative(-6f)
            }
}

public val LucideIcons.All.Grid2x2PlusDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Grid2x2Plus: ImageVector
    @Composable get() = Grid2x2PlusDefinition.asImageVector()
