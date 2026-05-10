package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ChartPie") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(21f, 12f)
                curveToRelative(.552f, 0f, 1.005f, -.449f, .95f, -.998f)
                arcToRelative(10f, 10f, 0f, false, false, -8.953f, -8.951f)
                curveToRelative(-.55f, -.055f, -.998f, .398f, -.998f, .95f)
                verticalLineToRelative(8f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(21.21f, 15.89f)
                arcTo(10f, 10f, 0f, true, true, 8f, 2.83f)
            }
}

public val LucideIcons.All.ChartPieDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ChartPie: ImageVector
    @Composable get() = ChartPieDefinition.asImageVector()
