package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("WineOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(8f, 22f)
                horizontalLineToRelative(8f)
            }
            lucidePath(strokeWidth) {
                moveTo(7f, 10f)
                horizontalLineToRelative(3f)
                moveToRelative(7f, 0f)
                horizontalLineToRelative(-1.343f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 15f)
                verticalLineToRelative(7f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.307f, 7.307f)
                arcTo(12.33f, 12.33f, 0f, false, false, 7f, 10f)
                arcToRelative(5f, 5f, 0f, false, false, 7.391f, 4.391f)
                moveTo(8.638f, 2.981f)
                curveTo(8.75f, 2.668f, 8.872f, 2.34f, 9f, 2f)
                horizontalLineToRelative(6f)
                curveToRelative(1.5f, 4f, 2f, 6f, 2f, 8f)
                curveToRelative(0f, .407f, -.05f, .809f, -.145f, 1.198f)
            }
            lucidePath(strokeWidth) {
                moveTo(2f, 2f)
                lineTo(22f, 22f)
            }
}

public val LucideIcons.All.WineOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.WineOff: ImageVector
    @Composable get() = WineOffDefinition.asImageVector()
