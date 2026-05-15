package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SprayCan") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3f, 3f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(7f, 5f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(11f, 7f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 7f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(7f, 9f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 11f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f, 5.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-4.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveToRelative(19f, 9f)
                lineToRelative(2f, 2f)
                verticalLineToRelative(10f)
                curveToRelative(0f, .6f, -.4f, 1f, -1f, 1f)
                horizontalLineToRelative(-6f)
                curveToRelative(-.6f, 0f, -1f, -.4f, -1f, -1f)
                verticalLineTo(11f)
                lineToRelative(2f, -2f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(13f, 14f)
                lineToRelative(8f, -2f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(13f, 19f)
                lineToRelative(8f, -2f)
            }
}

public val LucideIcons.All.SprayCanDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SprayCan: ImageVector
    @Composable get() = SprayCanDefinition.asImageVector()
