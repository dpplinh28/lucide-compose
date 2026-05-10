package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Toilet") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(7f, 12f)
                horizontalLineToRelative(13f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                arcToRelative(5f, 5f, 0f, false, true, -5f, 5f)
                horizontalLineToRelative(-.598f)
                arcToRelative(.5f, .5f, 0f, false, false, -.424f, .765f)
                lineToRelative(1.544f, 2.47f)
                arcToRelative(.5f, .5f, 0f, false, true, -.424f, .765f)
                horizontalLineTo(5.402f)
                arcToRelative(.5f, .5f, 0f, false, true, -.424f, -.765f)
                lineTo(7f, 18f)
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 18f)
                arcToRelative(5f, 5f, 0f, false, true, -5f, -5f)
                verticalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(8f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(8f)
            }
}

public val LucideIcons.All.ToiletDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Toilet: ImageVector
    @Composable get() = ToiletDefinition.asImageVector()
