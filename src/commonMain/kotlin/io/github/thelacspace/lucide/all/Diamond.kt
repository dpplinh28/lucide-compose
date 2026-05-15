package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Diamond") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.7f, 10.3f)
                arcToRelative(2.41f, 2.41f, 0f, false, false, 0f, 3.41f)
                lineToRelative(7.59f, 7.59f)
                arcToRelative(2.41f, 2.41f, 0f, false, false, 3.41f, 0f)
                lineToRelative(7.59f, -7.59f)
                arcToRelative(2.41f, 2.41f, 0f, false, false, 0f, -3.41f)
                lineToRelative(-7.59f, -7.59f)
                arcToRelative(2.41f, 2.41f, 0f, false, false, -3.41f, 0f)
                close()
            }
}

public val LucideIcons.All.DiamondDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Diamond: ImageVector
    @Composable get() = DiamondDefinition.asImageVector()
