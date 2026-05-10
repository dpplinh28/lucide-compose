package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FunnelX") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.531f, 3f)
                horizontalLineTo(3f)
                arcToRelative(1f, 1f, 0f, false, false, -.742f, 1.67f)
                lineToRelative(7.225f, 7.989f)
                arcTo(2f, 2f, 0f, false, true, 10f, 14f)
                verticalLineToRelative(6f)
                arcToRelative(1f, 1f, 0f, false, false, .553f, .895f)
                lineToRelative(2f, 1f)
                arcTo(1f, 1f, 0f, false, false, 14f, 21f)
                verticalLineToRelative(-7f)
                arcToRelative(2f, 2f, 0f, false, true, .517f, -1.341f)
                lineToRelative(.427f, -.473f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(16.5f, 3.5f)
                lineToRelative(5f, 5f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(21.5f, 3.5f)
                lineToRelative(-5f, 5f)
            }
}

public val LucideIcons.All.FunnelXDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FunnelX: ImageVector
    @Composable get() = FunnelXDefinition.asImageVector()
