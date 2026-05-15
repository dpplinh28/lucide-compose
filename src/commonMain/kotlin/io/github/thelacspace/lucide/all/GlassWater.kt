package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("GlassWater") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(5.116f, 4.104f)
                arcTo(1f, 1f, 0f, false, true, 6.11f, 3f)
                horizontalLineToRelative(11.78f)
                arcToRelative(1f, 1f, 0f, false, true, .994f, 1.105f)
                lineTo(17.19f, 20.21f)
                arcTo(2f, 2f, 0f, false, true, 15.2f, 22f)
                horizontalLineTo(8.8f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -1.79f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(6f, 12f)
                arcToRelative(5f, 5f, 0f, false, true, 6f, 0f)
                arcToRelative(5f, 5f, 0f, false, false, 6f, 0f)
            }
}

public val LucideIcons.All.GlassWaterDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.GlassWater: ImageVector
    @Composable get() = GlassWaterDefinition.asImageVector()
