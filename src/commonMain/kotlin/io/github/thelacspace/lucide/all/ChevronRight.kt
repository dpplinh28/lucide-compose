package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ChevronRight") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(9f, 18f)
                lineToRelative(6f, -6f)
                lineToRelative(-6f, -6f)
            }
}

public val LucideIcons.All.ChevronRightDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ChevronRight: ImageVector
    @Composable get() = ChevronRightDefinition.asImageVector()
