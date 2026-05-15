package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ToggleLeft") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(6.0f, 12.0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, 6.0f, 0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, -6.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f, 5.0f)
                horizontalLineToRelative(6.0f)
                arcToRelative(7.0f, 0.0f, 0f, false, true, 7.0f, 0.0f)
                verticalLineToRelative(14.0f)
                arcToRelative(7.0f, 0.0f, 0f, false, true, -7.0f, 0.0f)
                horizontalLineToRelative(-6.0f)
                arcToRelative(7.0f, 0.0f, 0f, false, true, -7.0f, -0.0f)
                verticalLineToRelative(-14.0f)
                arcToRelative(7.0f, 0.0f, 0f, false, true, 7.0f, -0.0f)
                close()
            }
}

public val LucideIcons.All.ToggleLeftDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ToggleLeft: ImageVector
    @Composable get() = ToggleLeftDefinition.asImageVector()
