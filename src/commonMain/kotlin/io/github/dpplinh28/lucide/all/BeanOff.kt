package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BeanOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(9f, 9f)
                curveToRelative(-.64f, .64f, -1.521f, .954f, -2.402f, 1.165f)
                arcTo(6f, 6f, 0f, false, false, 8f, 22f)
                arcToRelative(13.96f, 13.96f, 0f, false, false, 9.9f, -4.1f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.75f, 5.093f)
                arcTo(6f, 6f, 0f, false, true, 22f, 8f)
                curveToRelative(0f, 2.411f, -.61f, 4.68f, -1.683f, 6.66f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.341f, 10.62f)
                arcToRelative(4f, 4f, 0f, false, false, 6.487f, 1.208f)
                moveTo(10.62f, 5.341f)
                arcToRelative(4.015f, 4.015f, 0f, false, true, 2.039f, 2.04f)
            }
            lucidePath(strokeWidth) {
                moveTo(2f, 2f)
                lineTo(22f, 22f)
            }
}

public val LucideIcons.All.BeanOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BeanOff: ImageVector
    @Composable get() = BeanOffDefinition.asImageVector()
