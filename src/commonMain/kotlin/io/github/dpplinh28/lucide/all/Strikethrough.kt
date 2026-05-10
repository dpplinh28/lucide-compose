package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Strikethrough") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16f, 4f)
                horizontalLineTo(9f)
                arcToRelative(3f, 3f, 0f, false, false, -2.83f, 4f)
            }
            lucidePath(strokeWidth) {
                moveTo(14f, 12f)
                arcToRelative(4f, 4f, 0f, false, true, 0f, 8f)
                horizontalLineTo(6f)
            }
            lucidePath(strokeWidth) {
                moveTo(4f, 12f)
                lineTo(20f, 12f)
            }
}

public val LucideIcons.All.StrikethroughDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Strikethrough: ImageVector
    @Composable get() = StrikethroughDefinition.asImageVector()
