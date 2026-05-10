package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CircleChevronLeft") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0f, 12.0f)
                arcToRelative(10.0f, 10.0f, 0f, true, false, 20.0f, 0f)
                arcToRelative(10.0f, 10.0f, 0f, true, false, -20.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(14f, 16f)
                lineToRelative(-4f, -4f)
                lineToRelative(4f, -4f)
            }
}

public val LucideIcons.All.CircleChevronLeftDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CircleChevronLeft: ImageVector
    @Composable get() = CircleChevronLeftDefinition.asImageVector()
