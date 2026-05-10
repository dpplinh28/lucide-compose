package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ShieldX") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(20f, 13f)
                curveToRelative(0f, 5f, -3.5f, 7.5f, -7.66f, 8.95f)
                arcToRelative(1f, 1f, 0f, false, true, -.67f, -.01f)
                curveTo(7.5f, 20.5f, 4f, 18f, 4f, 13f)
                verticalLineTo(6f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                curveToRelative(2f, 0f, 4.5f, -1.2f, 6.24f, -2.72f)
                arcToRelative(1.17f, 1.17f, 0f, false, true, 1.52f, 0f)
                curveTo(14.51f, 3.81f, 17f, 5f, 19f, 5f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                close()
            }
            lucidePath(strokeWidth) {
                moveToRelative(14.5f, 9.5f)
                lineToRelative(-5f, 5f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(9.5f, 9.5f)
                lineToRelative(5f, 5f)
            }
}

public val LucideIcons.All.ShieldXDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ShieldX: ImageVector
    @Composable get() = ShieldXDefinition.asImageVector()
