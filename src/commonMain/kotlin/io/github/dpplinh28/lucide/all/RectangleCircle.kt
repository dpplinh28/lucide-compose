package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("RectangleCircle") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14f, 4f)
                verticalLineToRelative(16f)
                horizontalLineTo(3f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                verticalLineTo(5f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f, 12.0f)
                arcToRelative(8.0f, 8.0f, 0f, true, false, 16.0f, 0f)
                arcToRelative(8.0f, 8.0f, 0f, true, false, -16.0f, 0f)
            }
}

public val LucideIcons.All.RectangleCircleDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.RectangleCircle: ImageVector
    @Composable get() = RectangleCircleDefinition.asImageVector()
