package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("TreePalm") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(13f, 8f)
                curveToRelative(0f, -2.76f, -2.46f, -5f, -5.5f, -5f)
                reflectiveCurveTo(2f, 5.24f, 2f, 8f)
                horizontalLineToRelative(2f)
                lineToRelative(1f, -1f)
                lineToRelative(1f, 1f)
                horizontalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(13f, 7.14f)
                arcTo(5.82f, 5.82f, 0f, false, true, 16.5f, 6f)
                curveToRelative(3.04f, 0f, 5.5f, 2.24f, 5.5f, 5f)
                horizontalLineToRelative(-3f)
                lineToRelative(-1f, -1f)
                lineToRelative(-1f, 1f)
                horizontalLineToRelative(-3f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.89f, 9.71f)
                curveToRelative(-2.15f, 2.15f, -2.3f, 5.47f, -.35f, 7.43f)
                lineToRelative(4.24f, -4.25f)
                lineToRelative(.7f, -.7f)
                lineToRelative(.71f, -.71f)
                lineToRelative(2.12f, -2.12f)
                curveToRelative(-1.95f, -1.96f, -5.27f, -1.8f, -7.42f, .35f)
            }
            lucidePath(strokeWidth) {
                moveTo(11f, 15.5f)
                curveToRelative(.5f, 2.5f, -.17f, 4.5f, -1f, 6.5f)
                horizontalLineToRelative(4f)
                curveToRelative(2f, -5.5f, -.5f, -12f, -1f, -14f)
            }
}

public val LucideIcons.All.TreePalmDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.TreePalm: ImageVector
    @Composable get() = TreePalmDefinition.asImageVector()
