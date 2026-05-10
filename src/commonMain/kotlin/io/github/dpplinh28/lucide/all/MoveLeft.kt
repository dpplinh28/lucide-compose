package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MoveLeft") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(6f, 8f)
                lineTo(2f, 12f)
                lineTo(6f, 16f)
            }
            lucidePath(strokeWidth) {
                moveTo(2f, 12f)
                horizontalLineTo(22f)
            }
}

public val LucideIcons.All.MoveLeftDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MoveLeft: ImageVector
    @Composable get() = MoveLeftDefinition.asImageVector()
