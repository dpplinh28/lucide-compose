package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Trophy") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10f, 14.66f)
                verticalLineToRelative(1.626f)
                arcToRelative(2f, 2f, 0f, false, true, -.976f, 1.696f)
                arcTo(5f, 5f, 0f, false, false, 7f, 21.978f)
            }
            lucidePath(strokeWidth) {
                moveTo(14f, 14.66f)
                verticalLineToRelative(1.626f)
                arcToRelative(2f, 2f, 0f, false, false, .976f, 1.696f)
                arcTo(5f, 5f, 0f, false, true, 17f, 21.978f)
            }
            lucidePath(strokeWidth) {
                moveTo(18f, 9f)
                horizontalLineToRelative(1.5f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -5f)
                horizontalLineTo(18f)
            }
            lucidePath(strokeWidth) {
                moveTo(4f, 22f)
                horizontalLineToRelative(16f)
            }
            lucidePath(strokeWidth) {
                moveTo(6f, 9f)
                arcToRelative(6f, 6f, 0f, false, false, 12f, 0f)
                verticalLineTo(3f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                horizontalLineTo(7f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(6f, 9f)
                horizontalLineTo(4.5f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, -5f)
                horizontalLineTo(6f)
            }
}

public val LucideIcons.All.TrophyDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Trophy: ImageVector
    @Composable get() = TrophyDefinition.asImageVector()
