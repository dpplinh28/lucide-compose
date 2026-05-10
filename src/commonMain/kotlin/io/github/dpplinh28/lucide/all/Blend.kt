package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Blend") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0f, 9.0f)
                arcToRelative(7.0f, 7.0f, 0f, true, false, 14.0f, 0f)
                arcToRelative(7.0f, 7.0f, 0f, true, false, -14.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f, 15.0f)
                arcToRelative(7.0f, 7.0f, 0f, true, false, 14.0f, 0f)
                arcToRelative(7.0f, 7.0f, 0f, true, false, -14.0f, 0f)
            }
}

public val LucideIcons.All.BlendDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Blend: ImageVector
    @Composable get() = BlendDefinition.asImageVector()
