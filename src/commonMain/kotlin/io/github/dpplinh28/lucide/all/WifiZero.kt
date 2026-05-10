package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

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
