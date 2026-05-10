package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Plus") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(5f, 12f)
                horizontalLineToRelative(14f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 5f)
                verticalLineToRelative(14f)
            }
}

public val LucideIcons.All.PlusDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Plus: ImageVector
    @Composable get() = PlusDefinition.asImageVector()
