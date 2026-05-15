package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MouseRight") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 7.318f)
                verticalLineTo(10f)
            }
            lucidePath(strokeWidth) {
                moveTo(19f, 10f)
                verticalLineToRelative(5f)
                arcToRelative(7f, 7f, 0f, false, true, -14f, 0f)
                verticalLineTo(9f)
                curveToRelative(0f, -3.527f, 2.608f, -6.515f, 6f, -7f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, 4.0f, 0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, -4.0f, 0f)
            }
}

public val LucideIcons.All.MouseRightDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MouseRight: ImageVector
    @Composable get() = MouseRightDefinition.asImageVector()
