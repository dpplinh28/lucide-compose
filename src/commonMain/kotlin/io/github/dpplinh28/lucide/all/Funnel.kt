package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Funnel") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10f, 20f)
                arcToRelative(1f, 1f, 0f, false, false, .553f, .895f)
                lineToRelative(2f, 1f)
                arcTo(1f, 1f, 0f, false, false, 14f, 21f)
                verticalLineToRelative(-7f)
                arcToRelative(2f, 2f, 0f, false, true, .517f, -1.341f)
                lineTo(21.74f, 4.67f)
                arcTo(1f, 1f, 0f, false, false, 21f, 3f)
                horizontalLineTo(3f)
                arcToRelative(1f, 1f, 0f, false, false, -.742f, 1.67f)
                lineToRelative(7.225f, 7.989f)
                arcTo(2f, 2f, 0f, false, true, 10f, 14f)
                close()
            }
}

public val LucideIcons.All.FunnelDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Funnel: ImageVector
    @Composable get() = FunnelDefinition.asImageVector()
