package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Antenna") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2f, 12f)
                lineTo(7f, 2f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(7f, 12f)
                lineToRelative(5f, -10f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(12f, 12f)
                lineToRelative(5f, -10f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(17f, 12f)
                lineToRelative(5f, -10f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.5f, 7f)
                horizontalLineToRelative(15f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 16f)
                verticalLineToRelative(6f)
            }
}

public val LucideIcons.All.AntennaDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Antenna: ImageVector
    @Composable get() = AntennaDefinition.asImageVector()
