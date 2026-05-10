package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Space") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(22f, 17f)
                verticalLineToRelative(1f)
                curveToRelative(0f, .5f, -.5f, 1f, -1f, 1f)
                horizontalLineTo(3f)
                curveToRelative(-.5f, 0f, -1f, -.5f, -1f, -1f)
                verticalLineToRelative(-1f)
            }
}

public val LucideIcons.All.SpaceDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Space: ImageVector
    @Composable get() = SpaceDefinition.asImageVector()
