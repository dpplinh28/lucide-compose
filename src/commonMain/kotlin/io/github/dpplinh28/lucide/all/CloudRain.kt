package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CloudRain") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4f, 14.899f)
                arcTo(7f, 7f, 0f, true, true, 15.71f, 8f)
                horizontalLineToRelative(1.79f)
                arcToRelative(4.5f, 4.5f, 0f, false, true, 2.5f, 8.242f)
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 14f)
                verticalLineToRelative(6f)
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 14f)
                verticalLineToRelative(6f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 16f)
                verticalLineToRelative(6f)
            }
}

public val LucideIcons.All.CloudRainDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CloudRain: ImageVector
    @Composable get() = CloudRainDefinition.asImageVector()
