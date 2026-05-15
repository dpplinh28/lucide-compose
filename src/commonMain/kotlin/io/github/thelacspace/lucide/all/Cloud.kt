package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Cloud") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(17.5f, 19f)
                horizontalLineTo(9f)
                arcToRelative(7f, 7f, 0f, true, true, 6.71f, -9f)
                horizontalLineToRelative(1.79f)
                arcToRelative(4.5f, 4.5f, 0f, true, true, 0f, 9f)
                close()
            }
}

public val LucideIcons.All.CloudDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Cloud: ImageVector
    @Composable get() = CloudDefinition.asImageVector()
