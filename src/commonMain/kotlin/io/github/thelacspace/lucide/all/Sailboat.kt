package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Sailboat") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10f, 2f)
                verticalLineToRelative(15f)
            }
            lucidePath(strokeWidth) {
                moveTo(7f, 22f)
                arcToRelative(4f, 4f, 0f, false, true, -4f, -4f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                horizontalLineToRelative(16f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                arcToRelative(4f, 4f, 0f, false, true, -4f, 4f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(9.159f, 2.46f)
                arcToRelative(1f, 1f, 0f, false, true, 1.521f, -.193f)
                lineToRelative(9.977f, 8.98f)
                arcTo(1f, 1f, 0f, false, true, 20f, 13f)
                horizontalLineTo(4f)
                arcToRelative(1f, 1f, 0f, false, true, -.824f, -1.567f)
                close()
            }
}

public val LucideIcons.All.SailboatDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Sailboat: ImageVector
    @Composable get() = SailboatDefinition.asImageVector()
