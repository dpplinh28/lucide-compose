package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Bold") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(6f, 12f)
                horizontalLineToRelative(9f)
                arcToRelative(4f, 4f, 0f, false, true, 0f, 8f)
                horizontalLineTo(7f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                verticalLineTo(5f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                horizontalLineToRelative(7f)
                arcToRelative(4f, 4f, 0f, false, true, 0f, 8f)
            }
}

public val LucideIcons.All.BoldDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Bold: ImageVector
    @Composable get() = BoldDefinition.asImageVector()
