package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MoveUpRight") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(13f, 5f)
                horizontalLineTo(19f)
                verticalLineTo(11f)
            }
            lucidePath(strokeWidth) {
                moveTo(19f, 5f)
                lineTo(5f, 19f)
            }
}

public val LucideIcons.All.MoveUpRightDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MoveUpRight: ImageVector
    @Composable get() = MoveUpRightDefinition.asImageVector()
