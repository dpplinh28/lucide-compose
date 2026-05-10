package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Diameter") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(17.0f, 19.0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, 4.0f, 0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, -4.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f, 5.0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, 4.0f, 0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, -4.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.48f, 3.66f)
                arcToRelative(10f, 10f, 0f, false, true, 13.86f, 13.86f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(6.41f, 6.41f)
                lineToRelative(11.18f, 11.18f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.66f, 6.48f)
                arcToRelative(10f, 10f, 0f, false, false, 13.86f, 13.86f)
            }
}

public val LucideIcons.All.DiameterDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Diameter: ImageVector
    @Composable get() = DiameterDefinition.asImageVector()
