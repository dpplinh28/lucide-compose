package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Timeline") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4f, 12f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(4f, 16f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(4f, 20f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(4f, 4f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(4f, 8f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.414f, 13.414f)
                arcToRelative(2f, 2f, 0f, false, false, 1.414f, .586f)
                horizontalLineTo(19f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                verticalLineToRelative(-2f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                horizontalLineToRelative(-8.172f)
                arcToRelative(2f, 2f, 0f, false, false, -1.414f, .586f)
                lineTo(8f, 12f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(9.414f, 21.414f)
                arcToRelative(2f, 2f, 0f, false, false, 1.414f, .586f)
                horizontalLineTo(19f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                verticalLineToRelative(-2f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                horizontalLineToRelative(-8.172f)
                arcToRelative(2f, 2f, 0f, false, false, -1.414f, .586f)
                lineTo(8f, 20f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(9.414f, 5.414f)
                arcTo(2f, 2f, 0f, false, false, 10.828f, 6f)
                horizontalLineTo(19f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                verticalLineTo(3f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                horizontalLineToRelative(-8.172f)
                arcToRelative(2f, 2f, 0f, false, false, -1.414f, .586f)
                lineTo(8f, 4f)
                close()
            }
}

public val LucideIcons.All.TimelineDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Timeline: ImageVector
    @Composable get() = TimelineDefinition.asImageVector()
