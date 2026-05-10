package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Fish") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(6.5f, 12f)
                curveToRelative(.94f, -3.46f, 4.94f, -6f, 8.5f, -6f)
                curveToRelative(3.56f, 0f, 6.06f, 2.54f, 7f, 6f)
                curveToRelative(-.94f, 3.47f, -3.44f, 6f, -7f, 6f)
                reflectiveCurveToRelative(-7.56f, -2.53f, -8.5f, -6f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(18f, 12f)
                verticalLineToRelative(.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 17.93f)
                arcToRelative(9.77f, 9.77f, 0f, false, true, 0f, -11.86f)
            }
            lucidePath(strokeWidth) {
                moveTo(7f, 10.67f)
                curveTo(7f, 8f, 5.58f, 5.97f, 2.73f, 5.5f)
                curveToRelative(-1f, 1.5f, -1f, 5f, .23f, 6.5f)
                curveToRelative(-1.24f, 1.5f, -1.24f, 5f, -.23f, 6.5f)
                curveTo(5.58f, 18.03f, 7f, 16f, 7f, 13.33f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.46f, 7.26f)
                curveTo(10.2f, 5.88f, 9.17f, 4.24f, 8f, 3f)
                horizontalLineToRelative(5.8f)
                arcToRelative(2f, 2f, 0f, false, true, 1.98f, 1.67f)
                lineToRelative(.23f, 1.4f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(16.01f, 17.93f)
                lineToRelative(-.23f, 1.4f)
                arcTo(2f, 2f, 0f, false, true, 13.8f, 21f)
                horizontalLineTo(9.5f)
                arcToRelative(5.96f, 5.96f, 0f, false, false, 1.49f, -3.98f)
            }
}

public val LucideIcons.All.FishDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Fish: ImageVector
    @Composable get() = FishDefinition.asImageVector()
