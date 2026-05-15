package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("LensConcave") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(7f, 2f)
                arcToRelative(1f, 1f, 0f, false, false, -.8f, 1.6f)
                arcToRelative(14f, 14f, 0f, false, true, 0f, 16.8f)
                arcTo(1f, 1f, 0f, false, false, 7f, 22f)
                horizontalLineToRelative(10f)
                arcToRelative(1f, 1f, 0f, false, false, .8f, -1.6f)
                arcToRelative(14f, 14f, 0f, false, true, 0f, -16.8f)
                arcTo(1f, 1f, 0f, false, false, 17f, 2f)
                close()
            }
}

public val LucideIcons.All.LensConcaveDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.LensConcave: ImageVector
    @Composable get() = LensConcaveDefinition.asImageVector()
