package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Mountain") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(8f, 3f)
                lineToRelative(4f, 8f)
                lineToRelative(5f, -5f)
                lineToRelative(5f, 15f)
                horizontalLineTo(2f)
                lineTo(8f, 3f)
                close()
            }
}

public val LucideIcons.All.MountainDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Mountain: ImageVector
    @Composable get() = MountainDefinition.asImageVector()
