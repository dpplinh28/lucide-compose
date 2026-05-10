package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ArrowLeftToLine") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3f, 19f)
                verticalLineTo(5f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(13f, 6f)
                lineToRelative(-6f, 6f)
                lineToRelative(6f, 6f)
            }
            lucidePath(strokeWidth) {
                moveTo(7f, 12f)
                horizontalLineToRelative(14f)
            }
}

public val LucideIcons.All.ArrowLeftToLineDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ArrowLeftToLine: ImageVector
    @Composable get() = ArrowLeftToLineDefinition.asImageVector()
