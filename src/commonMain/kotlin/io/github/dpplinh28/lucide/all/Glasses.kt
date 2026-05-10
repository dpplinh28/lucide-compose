package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Glasses") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0f, 15.0f)
                arcToRelative(4.0f, 4.0f, 0f, true, false, 8.0f, 0f)
                arcToRelative(4.0f, 4.0f, 0f, true, false, -8.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f, 15.0f)
                arcToRelative(4.0f, 4.0f, 0f, true, false, 8.0f, 0f)
                arcToRelative(4.0f, 4.0f, 0f, true, false, -8.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14f, 15f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.5f, 13f)
                lineTo(5f, 7f)
                curveToRelative(.7f, -1.3f, 1.4f, -2f, 3f, -2f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.5f, 13f)
                lineTo(19f, 7f)
                curveToRelative(-.7f, -1.3f, -1.5f, -2f, -3f, -2f)
            }
}

public val LucideIcons.All.GlassesDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Glasses: ImageVector
    @Composable get() = GlassesDefinition.asImageVector()
