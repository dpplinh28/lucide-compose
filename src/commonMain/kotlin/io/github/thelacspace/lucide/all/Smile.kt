package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Smile") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0f, 12.0f)
                arcToRelative(10.0f, 10.0f, 0f, true, false, 20.0f, 0f)
                arcToRelative(10.0f, 10.0f, 0f, true, false, -20.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 14f)
                reflectiveCurveToRelative(1.5f, 2f, 4f, 2f)
                reflectiveCurveToRelative(4f, -2f, 4f, -2f)
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 9f)
                lineTo(9.01f, 9f)
            }
            lucidePath(strokeWidth) {
                moveTo(15f, 9f)
                lineTo(15.01f, 9f)
            }
}

public val LucideIcons.All.SmileDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Smile: ImageVector
    @Composable get() = SmileDefinition.asImageVector()
