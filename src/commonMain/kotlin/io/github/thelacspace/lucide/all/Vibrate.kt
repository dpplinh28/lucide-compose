package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Vibrate") { strokeWidth ->
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
                moveTo(9.0f, 5.0f)
                horizontalLineToRelative(6.0f)
                arcToRelative(1.0f, 0.0f, 0f, false, true, 1.0f, 0.0f)
                verticalLineToRelative(14.0f)
                arcToRelative(1.0f, 0.0f, 0f, false, true, -1.0f, 0.0f)
                horizontalLineToRelative(-6.0f)
                arcToRelative(1.0f, 0.0f, 0f, false, true, -1.0f, -0.0f)
                verticalLineToRelative(-14.0f)
                arcToRelative(1.0f, 0.0f, 0f, false, true, 1.0f, -0.0f)
                close()
            }
}

public val LucideIcons.All.VibrateDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Vibrate: ImageVector
    @Composable get() = VibrateDefinition.asImageVector()
