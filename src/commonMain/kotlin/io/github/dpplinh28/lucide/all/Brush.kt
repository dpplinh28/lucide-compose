package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Brush") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(11f, 10f)
                lineToRelative(3f, 3f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.5f, 21f)
                arcTo(3.5f, 3.5f, 0f, true, false, 3f, 17.5f)
                arcToRelative(2.62f, 2.62f, 0f, false, true, -.708f, 1.792f)
                arcTo(1f, 1f, 0f, false, false, 3f, 21f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(9.969f, 17.031f)
                lineTo(21.378f, 5.624f)
                arcToRelative(1f, 1f, 0f, false, false, -3.002f, -3.002f)
                lineTo(6.967f, 14.031f)
            }
}

public val LucideIcons.All.BrushDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Brush: ImageVector
    @Composable get() = BrushDefinition.asImageVector()
