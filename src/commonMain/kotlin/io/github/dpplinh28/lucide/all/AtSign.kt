package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("AtSign") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(8.0f, 12.0f)
                arcToRelative(4.0f, 4.0f, 0f, true, false, 8.0f, 0f)
                arcToRelative(4.0f, 4.0f, 0f, true, false, -8.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 8f)
                verticalLineToRelative(5f)
                arcToRelative(3f, 3f, 0f, false, false, 6f, 0f)
                verticalLineToRelative(-1f)
                arcToRelative(10f, 10f, 0f, true, false, -4f, 8f)
            }
}

public val LucideIcons.All.AtSignDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.AtSign: ImageVector
    @Composable get() = AtSignDefinition.asImageVector()
