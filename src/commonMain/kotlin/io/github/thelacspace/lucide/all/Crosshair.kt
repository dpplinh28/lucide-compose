package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Crosshair") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0f, 12.0f)
                arcToRelative(10.0f, 10.0f, 0f, true, false, 20.0f, 0f)
                arcToRelative(10.0f, 10.0f, 0f, true, false, -20.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(22f, 12f)
                lineTo(18f, 12f)
            }
            lucidePath(strokeWidth) {
                moveTo(6f, 12f)
                lineTo(2f, 12f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 6f)
                lineTo(12f, 2f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 22f)
                lineTo(12f, 18f)
            }
}

public val LucideIcons.All.CrosshairDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Crosshair: ImageVector
    @Composable get() = CrosshairDefinition.asImageVector()
