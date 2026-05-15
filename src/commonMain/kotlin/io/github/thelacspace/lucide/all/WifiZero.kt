package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("WifiZero") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 20f)
                horizontalLineToRelative(.01f)
            }
}

public val LucideIcons.All.WifiZeroDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.WifiZero: ImageVector
    @Composable get() = WifiZeroDefinition.asImageVector()
