package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

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
