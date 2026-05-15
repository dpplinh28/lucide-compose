package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Baby") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10f, 16f)
                curveToRelative(.5f, .3f, 1.2f, .5f, 2f, .5f)
                reflectiveCurveToRelative(1.5f, -.2f, 2f, -.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(15f, 12f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.38f, 6.813f)
                arcTo(9f, 9f, 0f, false, true, 20.8f, 10.2f)
                arcToRelative(2f, 2f, 0f, false, true, 0f, 3.6f)
                arcToRelative(9f, 9f, 0f, false, true, -17.6f, 0f)
                arcToRelative(2f, 2f, 0f, false, true, 0f, -3.6f)
                arcTo(9f, 9f, 0f, false, true, 12f, 3f)
                curveToRelative(2f, 0f, 3.5f, 1.1f, 3.5f, 2.5f)
                reflectiveCurveToRelative(-.9f, 2.5f, -2f, 2.5f)
                curveToRelative(-.8f, 0f, -1.5f, -.4f, -1.5f, -1f)
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 12f)
                horizontalLineToRelative(.01f)
            }
}

public val LucideIcons.All.BabyDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Baby: ImageVector
    @Composable get() = BabyDefinition.asImageVector()
