package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MapPlus") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(11f, 19f)
                lineToRelative(-1.106f, -.552f)
                arcToRelative(2f, 2f, 0f, false, false, -1.788f, 0f)
                lineToRelative(-3.659f, 1.83f)
                arcTo(1f, 1f, 0f, false, true, 3f, 19.381f)
                verticalLineTo(6.618f)
                arcToRelative(1f, 1f, 0f, false, true, .553f, -.894f)
                lineToRelative(4.553f, -2.277f)
                arcToRelative(2f, 2f, 0f, false, true, 1.788f, 0f)
                lineToRelative(4.212f, 2.106f)
                arcToRelative(2f, 2f, 0f, false, false, 1.788f, 0f)
                lineToRelative(3.659f, -1.83f)
                arcTo(1f, 1f, 0f, false, true, 21f, 4.619f)
                verticalLineTo(12f)
            }
            lucidePath(strokeWidth) {
                moveTo(15f, 5.764f)
                verticalLineTo(12f)
            }
            lucidePath(strokeWidth) {
                moveTo(18f, 15f)
                verticalLineToRelative(6f)
            }
            lucidePath(strokeWidth) {
                moveTo(21f, 18f)
                horizontalLineToRelative(-6f)
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 3.236f)
                verticalLineToRelative(15f)
            }
}

public val LucideIcons.All.MapPlusDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MapPlus: ImageVector
    @Composable get() = MapPlusDefinition.asImageVector()
