package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Soup") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 21f)
                arcToRelative(9f, 9f, 0f, false, false, 9f, -9f)
                horizontalLineTo(3f)
                arcToRelative(9f, 9f, 0f, false, false, 9f, 9f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(7f, 21f)
                horizontalLineToRelative(10f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.5f, 12f)
                lineTo(22f, 6f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.25f, 3f)
                curveToRelative(.27f, .1f, .8f, .53f, .75f, 1.36f)
                curveToRelative(-.06f, .83f, -.93f, 1.2f, -1f, 2.02f)
                curveToRelative(-.05f, .78f, .34f, 1.24f, .73f, 1.62f)
            }
            lucidePath(strokeWidth) {
                moveTo(11.25f, 3f)
                curveToRelative(.27f, .1f, .8f, .53f, .74f, 1.36f)
                curveToRelative(-.05f, .83f, -.93f, 1.2f, -.98f, 2.02f)
                curveToRelative(-.06f, .78f, .33f, 1.24f, .72f, 1.62f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.25f, 3f)
                curveToRelative(.27f, .1f, .8f, .53f, .75f, 1.36f)
                curveToRelative(-.06f, .83f, -.93f, 1.2f, -1f, 2.02f)
                curveToRelative(-.05f, .78f, .34f, 1.24f, .74f, 1.62f)
            }
}

public val LucideIcons.All.SoupDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Soup: ImageVector
    @Composable get() = SoupDefinition.asImageVector()
