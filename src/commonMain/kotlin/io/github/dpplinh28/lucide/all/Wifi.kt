package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Wifi") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 20f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(2f, 8.82f)
                arcToRelative(15f, 15f, 0f, false, true, 20f, 0f)
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

public val LucideIcons.All.WifiDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Wifi: ImageVector
    @Composable get() = WifiDefinition.asImageVector()
