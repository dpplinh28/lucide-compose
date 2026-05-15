package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ServerOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(7f, 2f)
                horizontalLineToRelative(13f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(4f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineToRelative(-5f)
            }
            lucidePath(strokeWidth) {
                moveTo(10f, 10f)
                lineTo(2.5f, 2.5f)
                curveTo(2f, 2f, 2f, 2.5f, 2f, 5f)
                verticalLineToRelative(3f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(6f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(22f, 17f)
                verticalLineToRelative(-1f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                horizontalLineToRelative(-1f)
            }
            lucidePath(strokeWidth) {
                moveTo(4f, 14f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(4f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(16.5f)
                lineToRelative(1f, -.5f)
                lineToRelative(.5f, .5f)
                lineToRelative(-8f, -8f)
                horizontalLineTo(4f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(6f, 18f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(2f, 2f)
                lineToRelative(20f, 20f)
            }
}

public val LucideIcons.All.ServerOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ServerOff: ImageVector
    @Composable get() = ServerOffDefinition.asImageVector()
