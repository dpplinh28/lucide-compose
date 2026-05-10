package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ChartLine") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3f, 3f)
                verticalLineToRelative(16f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(16f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(19f, 9f)
                lineToRelative(-5f, 5f)
                lineToRelative(-4f, -4f)
                lineToRelative(-3f, 3f)
            }
}

public val LucideIcons.All.ChartLineDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ChartLine: ImageVector
    @Composable get() = ChartLineDefinition.asImageVector()
