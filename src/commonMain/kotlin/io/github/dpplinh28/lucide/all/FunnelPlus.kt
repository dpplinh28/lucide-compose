package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FunnelPlus") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(13.354f, 3f)
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
                lineToRelative(1.218f, -1.348f)
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 6f)
                horizontalLineToRelative(6f)
            }
            lucidePath(strokeWidth) {
                moveTo(19f, 3f)
                verticalLineToRelative(6f)
            }
}

public val LucideIcons.All.FunnelPlusDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FunnelPlus: ImageVector
    @Composable get() = FunnelPlusDefinition.asImageVector()
