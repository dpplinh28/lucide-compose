package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ChartArea") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3f, 3f)
                verticalLineToRelative(16f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(16f)
            }
            lucidePath(strokeWidth) {
                moveTo(7f, 11.207f)
                arcToRelative(.5f, .5f, 0f, false, true, .146f, -.353f)
                lineToRelative(2f, -2f)
                arcToRelative(.5f, .5f, 0f, false, true, .708f, 0f)
                lineToRelative(3.292f, 3.292f)
                arcToRelative(.5f, .5f, 0f, false, false, .708f, 0f)
                lineToRelative(4.292f, -4.292f)
                arcToRelative(.5f, .5f, 0f, false, true, .854f, .353f)
                verticalLineTo(16f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                horizontalLineTo(8f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                close()
            }
}

public val LucideIcons.All.ChartAreaDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ChartArea: ImageVector
    @Composable get() = ChartAreaDefinition.asImageVector()
