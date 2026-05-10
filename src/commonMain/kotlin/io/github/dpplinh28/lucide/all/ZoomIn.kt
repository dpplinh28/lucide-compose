package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ZoomIn") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3.0f, 11.0f)
                arcToRelative(8.0f, 8.0f, 0f, true, false, 16.0f, 0f)
                arcToRelative(8.0f, 8.0f, 0f, true, false, -16.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(21f, 21f)
                lineTo(16.65f, 16.65f)
            }
            lucidePath(strokeWidth) {
                moveTo(11f, 8f)
                lineTo(11f, 14f)
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 11f)
                lineTo(14f, 11f)
            }
}

public val LucideIcons.All.ZoomInDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ZoomIn: ImageVector
    @Composable get() = ZoomInDefinition.asImageVector()
