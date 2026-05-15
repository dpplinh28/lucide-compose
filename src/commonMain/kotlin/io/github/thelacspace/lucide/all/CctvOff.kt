package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CctvOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(12.309f, 6.652f)
                lineToRelative(4.797f, 2.401f)
                arcToRelative(1f, 1f, 0f, false, true, .447f, 1.341f)
                lineToRelative(-.501f, 1.001f)
                lineToRelative(.605f, .605f)
                horizontalLineToRelative(2.725f)
                arcToRelative(1f, 1f, 0f, false, true, .894f, 1.447f)
                lineToRelative(-.724f, 1.448f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(15.166f, 15.166f)
                lineToRelative(-.719f, 1.439f)
                arcToRelative(1f, 1f, 0f, false, true, -1.342f, .447f)
                lineTo(3.61f, 12.3f)
                arcToRelative(2.92f, 2.92f, 0f, false, true, -1.3f, -3.91f)
                lineTo(3.69f, 5.6f)
                arcToRelative(2.9f, 2.9f, 0f, false, true, .873f, -1.037f)
            }
            lucidePath(strokeWidth) {
                moveTo(2f, 19f)
                horizontalLineToRelative(3.76f)
                arcToRelative(2f, 2f, 0f, false, false, 1.8f, -1.1f)
                lineToRelative(1.441f, -2.902f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(2f, 2f)
                lineToRelative(20f, 20f)
            }
            lucidePath(strokeWidth) {
                moveTo(2f, 21f)
                verticalLineToRelative(-4f)
            }
            lucidePath(strokeWidth) {
                moveTo(7f, 9f)
                horizontalLineToRelative(.01f)
            }
}

public val LucideIcons.All.CctvOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CctvOff: ImageVector
    @Composable get() = CctvOffDefinition.asImageVector()
