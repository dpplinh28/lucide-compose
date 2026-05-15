package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("PencilRuler") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(13f, 7f)
                lineTo(8.7f, 2.7f)
                arcToRelative(2.41f, 2.41f, 0f, false, false, -3.4f, 0f)
                lineTo(2.7f, 5.3f)
                arcToRelative(2.41f, 2.41f, 0f, false, false, 0f, 3.4f)
                lineTo(7f, 13f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(8f, 6f)
                lineToRelative(2f, -2f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(18f, 16f)
                lineToRelative(2f, -2f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(17f, 11f)
                lineToRelative(4.3f, 4.3f)
                curveToRelative(.94f, .94f, .94f, 2.46f, 0f, 3.4f)
                lineToRelative(-2.6f, 2.6f)
                curveToRelative(-.94f, .94f, -2.46f, .94f, -3.4f, 0f)
                lineTo(11f, 17f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.174f, 6.812f)
                arcToRelative(1f, 1f, 0f, false, false, -3.986f, -3.987f)
                lineTo(3.842f, 16.174f)
                arcToRelative(2f, 2f, 0f, false, false, -.5f, .83f)
                lineToRelative(-1.321f, 4.352f)
                arcToRelative(.5f, .5f, 0f, false, false, .623f, .622f)
                lineToRelative(4.353f, -1.32f)
                arcToRelative(2f, 2f, 0f, false, false, .83f, -.497f)
                close()
            }
            lucidePath(strokeWidth) {
                moveToRelative(15f, 5f)
                lineToRelative(4f, 4f)
            }
}

public val LucideIcons.All.PencilRulerDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.PencilRuler: ImageVector
    @Composable get() = PencilRulerDefinition.asImageVector()
