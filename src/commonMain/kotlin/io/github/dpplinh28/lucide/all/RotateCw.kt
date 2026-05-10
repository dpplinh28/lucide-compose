package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("RotateCw") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(21f, 12f)
                arcToRelative(9f, 9f, 0f, true, true, -9f, -9f)
                curveToRelative(2.52f, 0f, 4.93f, 1f, 6.74f, 2.74f)
                lineTo(21f, 8f)
            }
            lucidePath(strokeWidth) {
                moveTo(21f, 3f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-5f)
            }
}

public val LucideIcons.All.RotateCwDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.RotateCw: ImageVector
    @Composable get() = RotateCwDefinition.asImageVector()
