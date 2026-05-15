package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("PartyPopper") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(5.8f, 11.3f)
                lineTo(2f, 22f)
                lineToRelative(10.7f, -3.79f)
            }
            lucidePath(strokeWidth) {
                moveTo(4f, 3f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(22f, 8f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(15f, 2f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(22f, 20f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(22f, 2f)
                lineToRelative(-2.24f, .75f)
                arcToRelative(2.9f, 2.9f, 0f, false, false, -1.96f, 3.12f)
                curveToRelative(.1f, .86f, -.57f, 1.63f, -1.45f, 1.63f)
                horizontalLineToRelative(-.38f)
                curveToRelative(-.86f, 0f, -1.6f, .6f, -1.76f, 1.44f)
                lineTo(14f, 10f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(22f, 13f)
                lineToRelative(-.82f, -.33f)
                curveToRelative(-.86f, -.34f, -1.82f, .2f, -1.98f, 1.11f)
                curveToRelative(-.11f, .7f, -.72f, 1.22f, -1.43f, 1.22f)
                horizontalLineTo(17f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(11f, 2f)
                lineToRelative(.33f, .82f)
                curveToRelative(.34f, .86f, -.2f, 1.82f, -1.11f, 1.98f)
                curveTo(9.52f, 4.9f, 9f, 5.52f, 9f, 6.23f)
                verticalLineTo(7f)
            }
            lucidePath(strokeWidth) {
                moveTo(11f, 13f)
                curveToRelative(1.93f, 1.93f, 2.83f, 4.17f, 2f, 5f)
                curveToRelative(-.83f, .83f, -3.07f, -.07f, -5f, -2f)
                curveToRelative(-1.93f, -1.93f, -2.83f, -4.17f, -2f, -5f)
                curveToRelative(.83f, -.83f, 3.07f, .07f, 5f, 2f)
                close()
            }
}

public val LucideIcons.All.PartyPopperDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.PartyPopper: ImageVector
    @Composable get() = PartyPopperDefinition.asImageVector()
