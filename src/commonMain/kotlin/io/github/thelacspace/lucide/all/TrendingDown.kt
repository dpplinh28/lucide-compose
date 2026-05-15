package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("TrendingDown") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16f, 17f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-6f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(22f, 17f)
                lineToRelative(-8.5f, -8.5f)
                lineToRelative(-5f, 5f)
                lineTo(2f, 7f)
            }
}

public val LucideIcons.All.TrendingDownDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.TrendingDown: ImageVector
    @Composable get() = TrendingDownDefinition.asImageVector()
