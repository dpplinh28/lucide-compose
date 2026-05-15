package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Spotlight") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.295f, 19.562f)
                lineTo(16f, 22f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(17f, 16f)
                lineToRelative(3.758f, 2.098f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(19f, 12.5f)
                lineToRelative(3.026f, -.598f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.61f, 6.3f)
                arcToRelative(3f, 3f, 0f, false, false, -3.92f, 1.3f)
                lineToRelative(-1.38f, 2.79f)
                arcToRelative(3f, 3f, 0f, false, false, 1.3f, 3.91f)
                lineToRelative(6.89f, 3.597f)
                arcToRelative(1f, 1f, 0f, false, false, 1.342f, -.447f)
                lineToRelative(3.106f, -6.211f)
                arcToRelative(1f, 1f, 0f, false, false, -.447f, -1.341f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 9f)
                verticalLineTo(2f)
            }
}

public val LucideIcons.All.SpotlightDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Spotlight: ImageVector
    @Composable get() = SpotlightDefinition.asImageVector()
