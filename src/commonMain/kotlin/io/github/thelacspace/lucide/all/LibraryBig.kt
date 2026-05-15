package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("LibraryBig") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.0f, 3.0f)
                horizontalLineToRelative(6.0f)
                arcToRelative(1.0f, 0.0f, 0f, false, true, 1.0f, 0.0f)
                verticalLineToRelative(18.0f)
                arcToRelative(1.0f, 0.0f, 0f, false, true, -1.0f, 0.0f)
                horizontalLineToRelative(-6.0f)
                arcToRelative(1.0f, 0.0f, 0f, false, true, -1.0f, -0.0f)
                verticalLineToRelative(-18.0f)
                arcToRelative(1.0f, 0.0f, 0f, false, true, 1.0f, -0.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(7f, 3f)
                verticalLineToRelative(18f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.4f, 18.9f)
                curveToRelative(.2f, .5f, -.1f, 1.1f, -.6f, 1.3f)
                lineToRelative(-1.9f, .7f)
                curveToRelative(-.5f, .2f, -1.1f, -.1f, -1.3f, -.6f)
                lineTo(11.1f, 5.1f)
                curveToRelative(-.2f, -.5f, .1f, -1.1f, .6f, -1.3f)
                lineToRelative(1.9f, -.7f)
                curveToRelative(.5f, -.2f, 1.1f, .1f, 1.3f, .6f)
                close()
            }
}

public val LucideIcons.All.LibraryBigDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.LibraryBig: ImageVector
    @Composable get() = LibraryBigDefinition.asImageVector()
