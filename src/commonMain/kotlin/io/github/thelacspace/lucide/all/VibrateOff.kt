package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("VibrateOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(2f, 8f)
                lineToRelative(2f, 2f)
                lineToRelative(-2f, 2f)
                lineToRelative(2f, 2f)
                lineToRelative(-2f, 2f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(22f, 8f)
                lineToRelative(-2f, 2f)
                lineToRelative(2f, 2f)
                lineToRelative(-2f, 2f)
                lineToRelative(2f, 2f)
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 8f)
                verticalLineToRelative(10f)
                curveToRelative(0f, .55f, .45f, 1f, 1f, 1f)
                horizontalLineToRelative(6f)
                curveToRelative(.55f, 0f, 1f, -.45f, 1f, -1f)
                verticalLineToRelative(-2f)
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 10.34f)
                verticalLineTo(6f)
                curveToRelative(0f, -.55f, -.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-4.34f)
            }
            lucidePath(strokeWidth) {
                moveTo(2f, 2f)
                lineTo(22f, 22f)
            }
}

public val LucideIcons.All.VibrateOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.VibrateOff: ImageVector
    @Composable get() = VibrateOffDefinition.asImageVector()
