package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ToyBrick") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.0f, 8.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(1.0f, 0.0f, 0f, false, true, 1.0f, 0.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(1.0f, 0.0f, 0f, false, true, -1.0f, 0.0f)
                horizontalLineToRelative(-16.0f)
                arcToRelative(1.0f, 0.0f, 0f, false, true, -1.0f, -0.0f)
                verticalLineToRelative(-12.0f)
                arcToRelative(1.0f, 0.0f, 0f, false, true, 1.0f, -0.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(10f, 8f)
                verticalLineTo(5f)
                curveToRelative(0f, -.6f, -.4f, -1f, -1f, -1f)
                horizontalLineTo(6f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(3f)
            }
            lucidePath(strokeWidth) {
                moveTo(19f, 8f)
                verticalLineTo(5f)
                curveToRelative(0f, -.6f, -.4f, -1f, -1f, -1f)
                horizontalLineToRelative(-3f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(3f)
            }
}

public val LucideIcons.All.ToyBrickDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ToyBrick: ImageVector
    @Composable get() = ToyBrickDefinition.asImageVector()
