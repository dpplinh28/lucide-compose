package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("IterationCw") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4f, 10f)
                arcToRelative(8f, 8f, 0f, true, true, 8f, 8f)
                horizontalLineTo(4f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(8f, 22f)
                lineToRelative(-4f, -4f)
                lineToRelative(4f, -4f)
            }
}

public val LucideIcons.All.IterationCwDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.IterationCw: ImageVector
    @Composable get() = IterationCwDefinition.asImageVector()
