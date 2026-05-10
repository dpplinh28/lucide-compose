package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MapPinOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.75f, 7.09f)
                arcToRelative(3f, 3f, 0f, false, true, 2.16f, 2.16f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.072f, 17.072f)
                curveToRelative(-1.634f, 2.17f, -3.527f, 3.912f, -4.471f, 4.727f)
                arcToRelative(1f, 1f, 0f, false, true, -1.202f, 0f)
                curveTo(9.539f, 20.193f, 4f, 14.993f, 4f, 10f)
                arcToRelative(8f, 8f, 0f, false, true, 1.432f, -4.568f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(2f, 2f)
                lineToRelative(20f, 20f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.475f, 2.818f)
                arcTo(8f, 8f, 0f, false, true, 20f, 10f)
                curveToRelative(0f, 1.183f, -.31f, 2.377f, -.81f, 3.533f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.13f, 9.13f)
                arcToRelative(3f, 3f, 0f, false, false, 3.74f, 3.74f)
            }
}

public val LucideIcons.All.MapPinOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MapPinOff: ImageVector
    @Composable get() = MapPinOffDefinition.asImageVector()
