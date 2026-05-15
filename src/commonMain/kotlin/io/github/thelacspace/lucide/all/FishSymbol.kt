package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FishSymbol") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2f, 16f)
                reflectiveCurveToRelative(9f, -15f, 20f, -4f)
                curveTo(11f, 23f, 2f, 8f, 2f, 8f)
            }
}

public val LucideIcons.All.FishSymbolDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FishSymbol: ImageVector
    @Composable get() = FishSymbolDefinition.asImageVector()
