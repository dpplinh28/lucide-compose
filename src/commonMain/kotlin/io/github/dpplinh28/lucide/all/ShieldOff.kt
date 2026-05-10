package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ShieldOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(2f, 2f)
                lineToRelative(20f, 20f)
            }
            lucidePath(strokeWidth) {
                moveTo(5f, 5f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 5f, 3.5f, 7.5f, 7.67f, 8.94f)
                arcToRelative(1f, 1f, 0f, false, false, .67f, .01f)
                curveToRelative(2.35f, -.82f, 4.48f, -1.97f, 5.9f, -3.71f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.309f, 3.652f)
                arcTo(12.252f, 12.252f, 0f, false, false, 11.24f, 2.28f)
                arcToRelative(1.17f, 1.17f, 0f, false, true, 1.52f, 0f)
                curveTo(14.51f, 3.81f, 17f, 5f, 19f, 5f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(7f)
                arcToRelative(9.784f, 9.784f, 0f, false, true, -.08f, 1.264f)
            }
}

public val LucideIcons.All.ShieldOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ShieldOff: ImageVector
    @Composable get() = ShieldOffDefinition.asImageVector()
