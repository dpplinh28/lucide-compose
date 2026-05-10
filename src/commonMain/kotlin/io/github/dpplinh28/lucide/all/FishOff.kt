package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FishOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(18f, 12.47f)
                verticalLineToRelative(.03f)
                moveToRelative(0f, -.5f)
                verticalLineToRelative(.47f)
                moveToRelative(-.475f, 5.056f)
                arcTo(6.744f, 6.744f, 0f, false, true, 15f, 18f)
                curveToRelative(-3.56f, 0f, -7.56f, -2.53f, -8.5f, -6f)
                curveToRelative(.348f, -1.28f, 1.114f, -2.433f, 2.121f, -3.38f)
                moveToRelative(3.444f, -2.088f)
                arcTo(8.802f, 8.802f, 0f, false, true, 15f, 6f)
                curveToRelative(3.56f, 0f, 6.06f, 2.54f, 7f, 6f)
                curveToRelative(-.309f, 1.14f, -.786f, 2.177f, -1.413f, 3.058f)
            }
            lucidePath(strokeWidth) {
                moveTo(7f, 10.67f)
                curveTo(7f, 8f, 5.58f, 5.97f, 2.73f, 5.5f)
                curveToRelative(-1f, 1.5f, -1f, 5f, .23f, 6.5f)
                curveToRelative(-1.24f, 1.5f, -1.24f, 5f, -.23f, 6.5f)
                curveTo(5.58f, 18.03f, 7f, 16f, 7f, 13.33f)
                moveToRelative(7.48f, -4.372f)
                arcTo(9.77f, 9.77f, 0f, false, true, 16f, 6.07f)
                moveToRelative(0f, 11.86f)
                arcToRelative(9.77f, 9.77f, 0f, false, true, -1.728f, -3.618f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(16.01f, 17.93f)
                lineToRelative(-.23f, 1.4f)
                arcTo(2f, 2f, 0f, false, true, 13.8f, 21f)
                horizontalLineTo(9.5f)
                arcToRelative(5.96f, 5.96f, 0f, false, false, 1.49f, -3.98f)
                moveTo(8.53f, 3f)
                horizontalLineToRelative(5.27f)
                arcToRelative(2f, 2f, 0f, false, true, 1.98f, 1.67f)
                lineToRelative(.23f, 1.4f)
                moveTo(2f, 2f)
                lineToRelative(20f, 20f)
            }
}

public val LucideIcons.All.FishOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FishOff: ImageVector
    @Composable get() = FishOffDefinition.asImageVector()
