package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Broccoli") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10f, 13f)
                arcToRelative(3f, 3f, 0f, false, true, -2.121f, -5.121f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.606f, 14.204f)
                curveToRelative(-3.5f, 1.5f, -5.899f, 4.503f, -8.899f, 7.503f)
                arcTo(1f, 1f, 0f, false, true, 6f, 22f)
                curveToRelative(-2f, 0f, -4f, -2f, -4f, -4f)
                arcToRelative(1f, 1f, 0f, false, true, .293f, -.707f)
                curveToRelative(1.911f, -1.911f, 3.823f, -3.578f, 5.347f, -5.441f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.573f, 14.737f)
                arcTo(4f, 4f, 0f, false, true, 14f, 11f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.14f, 10.907f)
                arcToRelative(4f, 4f, 0f, true, true, 2.756f, -7.43f)
                arcTo(4f, 4f, 0f, false, true, 16.7f, 4.48f)
                arcToRelative(2f, 2f, 0f, false, true, 2.82f, 2.82f)
                arcToRelative(4f, 4f, 0f, false, true, 1.002f, 6.805f)
                arcTo(4f, 4f, 0f, true, true, 13f, 16f)
            }
}

public val LucideIcons.All.BroccoliDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Broccoli: ImageVector
    @Composable get() = BroccoliDefinition.asImageVector()
