package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MoveUpLeft") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(5f, 11f)
                verticalLineTo(5f)
                horizontalLineTo(11f)
            }
            lucidePath(strokeWidth) {
                moveTo(5f, 5f)
                lineTo(19f, 19f)
            }
}

public val LucideIcons.All.MoveUpLeftDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MoveUpLeft: ImageVector
    @Composable get() = MoveUpLeftDefinition.asImageVector()
