package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Fence") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4f, 3f)
                lineTo(2f, 5f)
                verticalLineToRelative(15f)
                curveToRelative(0f, .6f, .4f, 1f, 1f, 1f)
                horizontalLineToRelative(2f)
                curveToRelative(.6f, 0f, 1f, -.4f, 1f, -1f)
                verticalLineTo(5f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(6f, 8f)
                horizontalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(6f, 18f)
                horizontalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(12f, 3f)
                lineToRelative(-2f, 2f)
                verticalLineToRelative(15f)
                curveToRelative(0f, .6f, .4f, 1f, 1f, 1f)
                horizontalLineToRelative(2f)
                curveToRelative(.6f, 0f, 1f, -.4f, 1f, -1f)
                verticalLineTo(5f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(14f, 8f)
                horizontalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(14f, 18f)
                horizontalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(20f, 3f)
                lineToRelative(-2f, 2f)
                verticalLineToRelative(15f)
                curveToRelative(0f, .6f, .4f, 1f, 1f, 1f)
                horizontalLineToRelative(2f)
                curveToRelative(.6f, 0f, 1f, -.4f, 1f, -1f)
                verticalLineTo(5f)
                close()
            }
}

public val LucideIcons.All.FenceDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Fence: ImageVector
    @Composable get() = FenceDefinition.asImageVector()
