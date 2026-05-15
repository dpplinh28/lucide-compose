package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Hd") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10f, 12f)
                horizontalLineTo(6f)
            }
            lucidePath(strokeWidth) {
                moveTo(10f, 15f)
                verticalLineTo(9f)
            }
            lucidePath(strokeWidth) {
                moveTo(14f, 14.5f)
                arcToRelative(.5f, .5f, 0f, false, false, .5f, .5f)
                horizontalLineToRelative(1f)
                arcToRelative(2.5f, 2.5f, 0f, false, false, 2.5f, -2.5f)
                verticalLineToRelative(-1f)
                arcTo(2.5f, 2.5f, 0f, false, false, 15.5f, 9f)
                horizontalLineToRelative(-1f)
                arcToRelative(.5f, .5f, 0f, false, false, -.5f, .5f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(6f, 15f)
                verticalLineTo(9f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f, 5.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, 2.0f, 0.0f)
                verticalLineToRelative(14.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, -2.0f, 0.0f)
                horizontalLineToRelative(-16.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, -2.0f, -0.0f)
                verticalLineToRelative(-14.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, 2.0f, -0.0f)
                close()
            }
}

public val LucideIcons.All.HdDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Hd: ImageVector
    @Composable get() = HdDefinition.asImageVector()
