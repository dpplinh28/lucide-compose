package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("WifiHigh") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 20f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(5f, 12.859f)
                arcToRelative(10f, 10f, 0f, false, true, 14f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.5f, 16.429f)
                arcToRelative(5f, 5f, 0f, false, true, 7f, 0f)
            }
}

public val LucideIcons.All.WifiHighDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.WifiHigh: ImageVector
    @Composable get() = WifiHighDefinition.asImageVector()
