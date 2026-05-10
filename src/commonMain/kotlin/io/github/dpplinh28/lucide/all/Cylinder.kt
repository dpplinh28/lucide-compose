package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

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
