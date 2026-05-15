package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Cylinder") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3f, 5f)
                verticalLineToRelative(14f)
                arcToRelative(9f, 3f, 0f, false, false, 18f, 0f)
                verticalLineTo(5f)
            }
}

public val LucideIcons.All.CylinderDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Cylinder: ImageVector
    @Composable get() = CylinderDefinition.asImageVector()
