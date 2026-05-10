package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Shapes") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(8.3f, 10f)
                arcToRelative(.7f, .7f, 0f, false, true, -.626f, -1.079f)
                lineTo(11.4f, 3f)
                arcToRelative(.7f, .7f, 0f, false, true, 1.198f, -.043f)
                lineTo(16.3f, 8.9f)
                arcToRelative(.7f, .7f, 0f, false, true, -.572f, 1.1f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f, 14.0f)
                horizontalLineToRelative(5.0f)
                arcToRelative(1.0f, 0.0f, 0f, false, true, 1.0f, 0.0f)
                verticalLineToRelative(7.0f)
                arcToRelative(1.0f, 0.0f, 0f, false, true, -1.0f, 0.0f)
                horizontalLineToRelative(-5.0f)
                arcToRelative(1.0f, 0.0f, 0f, false, true, -1.0f, -0.0f)
                verticalLineToRelative(-7.0f)
                arcToRelative(1.0f, 0.0f, 0f, false, true, 1.0f, -0.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f, 17.5f)
                arcToRelative(3.5f, 3.5f, 0f, true, false, 7.0f, 0f)
                arcToRelative(3.5f, 3.5f, 0f, true, false, -7.0f, 0f)
            }
}

public val LucideIcons.All.ShapesDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Shapes: ImageVector
    @Composable get() = ShapesDefinition.asImageVector()
