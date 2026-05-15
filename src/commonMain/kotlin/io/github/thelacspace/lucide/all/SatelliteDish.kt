package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SatelliteDish") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4f, 10f)
                arcToRelative(7.31f, 7.31f, 0f, false, false, 10f, 10f)
                close()
            }
            lucidePath(strokeWidth) {
                moveToRelative(9f, 15f)
                lineToRelative(3f, -3f)
            }
            lucidePath(strokeWidth) {
                moveTo(17f, 13f)
                arcToRelative(6f, 6f, 0f, false, false, -6f, -6f)
            }
            lucidePath(strokeWidth) {
                moveTo(21f, 13f)
                arcTo(10f, 10f, 0f, false, false, 11f, 3f)
            }
}

public val LucideIcons.All.SatelliteDishDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SatelliteDish: ImageVector
    @Composable get() = SatelliteDishDefinition.asImageVector()
