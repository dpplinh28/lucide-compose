package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Popcorn") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(18f, 8f)
                arcToRelative(2f, 2f, 0f, false, false, 0f, -4f)
                arcToRelative(2f, 2f, 0f, false, false, -4f, 0f)
                arcToRelative(2f, 2f, 0f, false, false, -4f, 0f)
                arcToRelative(2f, 2f, 0f, false, false, -4f, 0f)
                arcToRelative(2f, 2f, 0f, false, false, 0f, 4f)
            }
            lucidePath(strokeWidth) {
                moveTo(10f, 22f)
                lineTo(9f, 8f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(14f, 22f)
                lineToRelative(1f, -14f)
            }
            lucidePath(strokeWidth) {
                moveTo(20f, 8f)
                curveToRelative(.5f, 0f, .9f, .4f, .8f, 1f)
                lineToRelative(-2.6f, 12f)
                curveToRelative(-.1f, .5f, -.7f, 1f, -1.2f, 1f)
                horizontalLineTo(7f)
                curveToRelative(-.6f, 0f, -1.1f, -.4f, -1.2f, -1f)
                lineTo(3.2f, 9f)
                curveToRelative(-.1f, -.6f, .3f, -1f, .8f, -1f)
                close()
            }
}

public val LucideIcons.All.PopcornDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Popcorn: ImageVector
    @Composable get() = PopcornDefinition.asImageVector()
