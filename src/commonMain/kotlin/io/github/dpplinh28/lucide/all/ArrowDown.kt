package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ArrowDown") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 5f)
                verticalLineToRelative(14f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(19f, 12f)
                lineToRelative(-7f, 7f)
                lineToRelative(-7f, -7f)
            }
}

public val LucideIcons.All.ArrowDownDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ArrowDown: ImageVector
    @Composable get() = ArrowDownDefinition.asImageVector()
