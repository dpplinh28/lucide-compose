package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("HandHeart") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11f, 14f)
                horizontalLineToRelative(2f)
                arcToRelative(2f, 2f, 0f, false, false, 0f, -4f)
                horizontalLineToRelative(-3f)
                curveToRelative(-.6f, 0f, -1.1f, .2f, -1.4f, .6f)
                lineTo(3f, 16f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(14.45f, 13.39f)
                lineToRelative(5.05f, -4.694f)
                curveTo(20.196f, 8f, 21f, 6.85f, 21f, 5.75f)
                arcToRelative(2.75f, 2.75f, 0f, false, false, -4.797f, -1.837f)
                arcToRelative(.276f, .276f, 0f, false, true, -.406f, 0f)
                arcTo(2.75f, 2.75f, 0f, false, false, 11f, 5.75f)
                curveToRelative(0f, 1.2f, .802f, 2.248f, 1.5f, 2.946f)
                lineTo(16f, 11.95f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(2f, 15f)
                lineToRelative(6f, 6f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(7f, 20f)
                lineToRelative(1.6f, -1.4f)
                curveToRelative(.3f, -.4f, .8f, -.6f, 1.4f, -.6f)
                horizontalLineToRelative(4f)
                curveToRelative(1.1f, 0f, 2.1f, -.4f, 2.8f, -1.2f)
                lineToRelative(4.6f, -4.4f)
                arcToRelative(1f, 1f, 0f, false, false, -2.75f, -2.91f)
            }
}

public val LucideIcons.All.HandHeartDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.HandHeart: ImageVector
    @Composable get() = HandHeartDefinition.asImageVector()
