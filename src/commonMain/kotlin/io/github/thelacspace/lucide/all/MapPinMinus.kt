package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MapPinMinus") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(18.977f, 14f)
                curveTo(19.6f, 12.701f, 20f, 11.343f, 20f, 10f)
                arcToRelative(8f, 8f, 0f, false, false, -16f, 0f)
                curveToRelative(0f, 4.993f, 5.539f, 10.193f, 7.399f, 11.799f)
                arcToRelative(1f, 1f, 0f, false, false, 1.202f, 0f)
                arcToRelative(32f, 32f, 0f, false, false, .824f, -.738f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f, 10.0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, 6.0f, 0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, -6.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 18f)
                horizontalLineToRelative(6f)
            }
}

public val LucideIcons.All.MapPinMinusDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MapPinMinus: ImageVector
    @Composable get() = MapPinMinusDefinition.asImageVector()
