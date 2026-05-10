package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CannabisOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 22f)
                verticalLineToRelative(-4f)
                curveToRelative(1.5f, 1.5f, 3.5f, 3f, 6f, 3f)
                curveToRelative(0f, -1.5f, -.5f, -3.5f, -2f, -5f)
            }
            lucidePath(strokeWidth) {
                moveTo(13.988f, 8.327f)
                curveTo(13.902f, 6.054f, 13.365f, 3.82f, 12f, 2f)
                arcToRelative(9.3f, 9.3f, 0f, false, false, -1.445f, 2.9f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.375f, 11.725f)
                curveTo(18.882f, 10.53f, 21f, 7.841f, 21f, 6f)
                curveToRelative(-2.324f, 0f, -5.08f, 1.296f, -6.662f, 2.684f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(2f, 2f)
                lineToRelative(20f, 20f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.024f, 15.378f)
                arcTo(15f, 15f, 0f, false, false, 22f, 15f)
                curveToRelative(-.426f, -1.279f, -2.67f, -2.557f, -4.25f, -2.907f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.995f, 6.992f)
                curveTo(5.714f, 6.4f, 4.29f, 6f, 3f, 6f)
                curveToRelative(0f, 2f, 2.5f, 5f, 4f, 6f)
                curveToRelative(-1.5f, 0f, -4.5f, 1.5f, -5f, 3f)
                curveToRelative(3.5f, 1.5f, 6f, 1f, 6f, 1f)
                curveToRelative(-1.5f, 1.5f, -2f, 3.5f, -2f, 5f)
                curveToRelative(2.5f, 0f, 4.5f, -1.5f, 6f, -3f)
            }
}

public val LucideIcons.All.CannabisOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CannabisOff: ImageVector
    @Composable get() = CannabisOffDefinition.asImageVector()
