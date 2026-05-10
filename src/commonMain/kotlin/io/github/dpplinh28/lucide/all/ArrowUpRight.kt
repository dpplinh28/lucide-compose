package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ArrowUpRight") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(7f, 7f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(10f)
            }
            lucidePath(strokeWidth) {
                moveTo(7f, 17f)
                lineTo(17f, 7f)
            }
}

public val LucideIcons.All.ArrowUpRightDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ArrowUpRight: ImageVector
    @Composable get() = ArrowUpRightDefinition.asImageVector()
