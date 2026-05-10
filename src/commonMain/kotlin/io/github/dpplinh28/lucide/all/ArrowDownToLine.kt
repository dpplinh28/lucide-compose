package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ArrowDownToLine") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 17f)
                verticalLineTo(3f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(6f, 11f)
                lineToRelative(6f, 6f)
                lineToRelative(6f, -6f)
            }
            lucidePath(strokeWidth) {
                moveTo(19f, 21f)
                horizontalLineTo(5f)
            }
}

public val LucideIcons.All.ArrowDownToLineDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ArrowDownToLine: ImageVector
    @Composable get() = ArrowDownToLineDefinition.asImageVector()
