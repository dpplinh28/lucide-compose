package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ArrowLeft") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(12f, 19f)
                lineToRelative(-7f, -7f)
                lineToRelative(7f, -7f)
            }
            lucidePath(strokeWidth) {
                moveTo(19f, 12f)
                horizontalLineTo(5f)
            }
}

public val LucideIcons.All.ArrowLeftDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ArrowLeft: ImageVector
    @Composable get() = ArrowLeftDefinition.asImageVector()
