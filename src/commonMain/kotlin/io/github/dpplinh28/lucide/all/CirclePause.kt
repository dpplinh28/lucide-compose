package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CirclePause") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0f, 12.0f)
                arcToRelative(10.0f, 10.0f, 0f, true, false, 20.0f, 0f)
                arcToRelative(10.0f, 10.0f, 0f, true, false, -20.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(10f, 15f)
                lineTo(10f, 9f)
            }
            lucidePath(strokeWidth) {
                moveTo(14f, 15f)
                lineTo(14f, 9f)
            }
}

public val LucideIcons.All.CirclePauseDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CirclePause: ImageVector
    @Composable get() = CirclePauseDefinition.asImageVector()
