package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CircleGauge") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.6f, 2.7f)
                arcToRelative(10f, 10f, 0f, true, false, 5.7f, 5.7f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f, 12.0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, 4.0f, 0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, -4.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(13.4f, 10.6f)
                lineTo(19f, 5f)
            }
}

public val LucideIcons.All.CircleGaugeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CircleGauge: ImageVector
    @Composable get() = CircleGaugeDefinition.asImageVector()
