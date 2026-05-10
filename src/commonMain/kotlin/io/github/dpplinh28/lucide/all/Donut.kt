package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Donut") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(20.5f, 10f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, -2.4f, -3f)
                horizontalLineTo(18f)
                arcToRelative(2.95f, 2.95f, 0f, false, true, -2.6f, -4.4f)
                arcToRelative(10f, 10f, 0f, true, false, 6.3f, 7.1f)
                curveToRelative(-.3f, .2f, -.8f, .3f, -1.2f, .3f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f, 12.0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, 6.0f, 0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, -6.0f, 0f)
            }
}

public val LucideIcons.All.DonutDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Donut: ImageVector
    @Composable get() = DonutDefinition.asImageVector()
