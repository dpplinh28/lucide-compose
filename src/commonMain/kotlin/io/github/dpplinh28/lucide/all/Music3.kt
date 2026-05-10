package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Music3") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(8.0f, 18.0f)
                arcToRelative(4.0f, 4.0f, 0f, true, false, 8.0f, 0f)
                arcToRelative(4.0f, 4.0f, 0f, true, false, -8.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 18f)
                verticalLineTo(2f)
            }
}

public val LucideIcons.All.Music3Definition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Music3: ImageVector
    @Composable get() = Music3Definition.asImageVector()
