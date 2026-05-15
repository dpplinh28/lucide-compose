package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MapPinMinusInside") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(20f, 10f)
                curveToRelative(0f, 4.993f, -5.539f, 10.193f, -7.399f, 11.799f)
                arcToRelative(1f, 1f, 0f, false, true, -1.202f, 0f)
                curveTo(9.539f, 20.193f, 4f, 14.993f, 4f, 10f)
                arcToRelative(8f, 8f, 0f, false, true, 16f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 10f)
                horizontalLineToRelative(6f)
            }
}

public val LucideIcons.All.MapPinMinusInsideDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MapPinMinusInside: ImageVector
    @Composable get() = MapPinMinusInsideDefinition.asImageVector()
