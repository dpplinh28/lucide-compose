package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

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
