package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Navigation2") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 2f)
                lineTo(19f, 21f)
                lineTo(12f, 17f)
                lineTo(5f, 21f)
                lineTo(12f, 2f)
                close()
            }
}

public val LucideIcons.All.Navigation2Definition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Navigation2: ImageVector
    @Composable get() = Navigation2Definition.asImageVector()
