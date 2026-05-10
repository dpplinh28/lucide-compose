package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MoveDownLeft") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11f, 19f)
                horizontalLineTo(5f)
                verticalLineTo(13f)
            }
            lucidePath(strokeWidth) {
                moveTo(19f, 5f)
                lineTo(5f, 19f)
            }
}

public val LucideIcons.All.MoveDownLeftDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MoveDownLeft: ImageVector
    @Composable get() = MoveDownLeftDefinition.asImageVector()
