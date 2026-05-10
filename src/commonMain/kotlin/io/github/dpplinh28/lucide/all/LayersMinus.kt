package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("LayersMinus") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.83f, 2.18f)
                arcToRelative(2f, 2f, 0f, false, false, -1.66f, 0f)
                lineTo(2.6f, 6.08f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, 1.83f)
                lineToRelative(8.58f, 3.91f)
                arcToRelative(2f, 2f, 0f, false, false, .83f, .18f)
                arcToRelative(2f, 2f, 0f, false, false, .83f, -.18f)
                lineToRelative(8.58f, -3.9f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -1.832f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 17f)
                horizontalLineToRelative(6f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.003f, 11.995f)
                arcToRelative(1f, 1f, 0f, false, false, .597f, .915f)
                lineToRelative(8.58f, 3.91f)
                arcToRelative(2f, 2f, 0f, false, false, .83f, .18f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.003f, 16.995f)
                arcToRelative(1f, 1f, 0f, false, false, .597f, .915f)
                lineToRelative(8.58f, 3.91f)
                arcToRelative(2f, 2f, 0f, false, false, .83f, .18f)
                arcToRelative(2f, 2f, 0f, false, false, .83f, -.18f)
                lineToRelative(2.11f, -.96f)
            }
            lucidePath(strokeWidth) {
                moveTo(22.018f, 12.004f)
                arcToRelative(1f, 1f, 0f, false, true, -.598f, .916f)
                lineToRelative(-.177f, .08f)
            }
}

public val LucideIcons.All.LayersMinusDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.LayersMinus: ImageVector
    @Composable get() = LayersMinusDefinition.asImageVector()
