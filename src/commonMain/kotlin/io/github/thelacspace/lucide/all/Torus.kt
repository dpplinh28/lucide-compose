package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector

private val _ActivityDefinition = LucideIconDefinition("Torus") { strokeWidth ->
    
}

public val LucideIcons.All.TorusDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Torus: ImageVector
    @Composable get() = TorusDefinition.asImageVector()
