package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Subscript") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(4f, 5f)
                lineToRelative(8f, 8f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(12f, 5f)
                lineToRelative(-8f, 8f)
            }
            lucidePath(strokeWidth) {
                moveTo(20f, 19f)
                horizontalLineToRelative(-4f)
                curveToRelative(0f, -1.5f, .44f, -2f, 1.5f, -2.5f)
                reflectiveCurveTo(20f, 15.33f, 20f, 14f)
                curveToRelative(0f, -.47f, -.17f, -.93f, -.48f, -1.29f)
                arcToRelative(2.11f, 2.11f, 0f, false, false, -2.62f, -.44f)
                curveToRelative(-.42f, .24f, -.74f, .62f, -.9f, 1.07f)
            }
}

public val LucideIcons.All.SubscriptDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Subscript: ImageVector
    @Composable get() = SubscriptDefinition.asImageVector()
