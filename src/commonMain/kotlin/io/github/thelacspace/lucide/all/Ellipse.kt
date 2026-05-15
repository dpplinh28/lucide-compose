package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector

private val _ActivityDefinition = LucideIconDefinition("Ellipse") { strokeWidth ->
    
}

public val LucideIcons.All.EllipseDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Ellipse: ImageVector
    @Composable get() = EllipseDefinition.asImageVector()
