package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Ellipse") { strokeWidth ->
    
}

public val LucideIcons.All.EllipseDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Ellipse: ImageVector
    @Composable get() = EllipseDefinition.asImageVector()
