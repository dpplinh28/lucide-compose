package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("HandCoins") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11f, 15f)
                horizontalLineToRelative(2f)
                arcToRelative(2f, 2f, 0f, true, false, 0f, -4f)
                horizontalLineToRelative(-3f)
                curveToRelative(-.6f, 0f, -1.1f, .2f, -1.4f, .6f)
                lineTo(3f, 17f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(7f, 21f)
                lineToRelative(1.6f, -1.4f)
                curveToRelative(.3f, -.4f, .8f, -.6f, 1.4f, -.6f)
                horizontalLineToRelative(4f)
                curveToRelative(1.1f, 0f, 2.1f, -.4f, 2.8f, -1.2f)
                lineToRelative(4.6f, -4.4f)
                arcToRelative(2f, 2f, 0f, false, false, -2.75f, -2.91f)
                lineToRelative(-4.2f, 3.9f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(2f, 16f)
                lineToRelative(6f, 6f)
            }
            lucidePath(strokeWidth) {
                moveTo(13.1f, 9.0f)
                arcToRelative(2.9f, 2.9f, 0f, true, false, 5.8f, 0f)
                arcToRelative(2.9f, 2.9f, 0f, true, false, -5.8f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f, 5.0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, 6.0f, 0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, -6.0f, 0f)
            }
}

public val LucideIcons.All.HandCoinsDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.HandCoins: ImageVector
    @Composable get() = HandCoinsDefinition.asImageVector()
