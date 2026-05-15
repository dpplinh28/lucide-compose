package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Mouse") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f, 2.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(7.0f, 0.0f, 0f, false, true, 7.0f, 0.0f)
                verticalLineToRelative(20.0f)
                arcToRelative(7.0f, 0.0f, 0f, false, true, -7.0f, 0.0f)
                horizontalLineToRelative(-0.0f)
                arcToRelative(7.0f, 0.0f, 0f, false, true, -7.0f, -0.0f)
                verticalLineToRelative(-20.0f)
                arcToRelative(7.0f, 0.0f, 0f, false, true, 7.0f, -0.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 6f)
                verticalLineToRelative(4f)
            }
}

public val LucideIcons.All.MouseDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Mouse: ImageVector
    @Composable get() = MouseDefinition.asImageVector()
