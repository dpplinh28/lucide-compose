package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SwatchBook") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11f, 17f)
                arcToRelative(4f, 4f, 0f, false, true, -8f, 0f)
                verticalLineTo(5f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(4f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(16.7f, 13f)
                horizontalLineTo(19f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(4f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineTo(7f)
            }
            lucidePath(strokeWidth) {
                moveTo(7f, 17f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(11f, 8f)
                lineToRelative(2.3f, -2.3f)
                arcToRelative(2.4f, 2.4f, 0f, false, true, 3.404f, .004f)
                lineTo(18.6f, 7.6f)
                arcToRelative(2.4f, 2.4f, 0f, false, true, .026f, 3.434f)
                lineTo(9.9f, 19.8f)
            }
}

public val LucideIcons.All.SwatchBookDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SwatchBook: ImageVector
    @Composable get() = SwatchBookDefinition.asImageVector()
