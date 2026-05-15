package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Shovel") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(21.56f, 4.56f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 0f, 2.122f)
                lineToRelative(-.47f, .47f)
                arcToRelative(3f, 3f, 0f, false, true, -4.212f, -.03f)
                arcToRelative(3f, 3f, 0f, false, true, 0f, -4.243f)
                lineToRelative(.44f, -.44f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 2.121f, 0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 22f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                verticalLineToRelative(-3.586f)
                arcToRelative(1f, 1f, 0f, false, true, .293f, -.707f)
                lineToRelative(3.355f, -3.355f)
                arcToRelative(1.205f, 1.205f, 0f, false, true, 1.704f, 0f)
                lineToRelative(3.296f, 3.296f)
                arcToRelative(1.205f, 1.205f, 0f, false, true, 0f, 1.704f)
                lineToRelative(-3.355f, 3.355f)
                arcToRelative(1f, 1f, 0f, false, true, -.707f, .293f)
                close()
            }
            lucidePath(strokeWidth) {
                moveToRelative(9f, 15f)
                lineToRelative(7.879f, -7.878f)
            }
}

public val LucideIcons.All.ShovelDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Shovel: ImageVector
    @Composable get() = ShovelDefinition.asImageVector()
