package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Sigma") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(18f, 7f)
                verticalLineTo(5f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                horizontalLineTo(6.5f)
                arcToRelative(.5f, .5f, 0f, false, false, -.4f, .8f)
                lineToRelative(4.5f, 6f)
                arcToRelative(2f, 2f, 0f, false, true, 0f, 2.4f)
                lineToRelative(-4.5f, 6f)
                arcToRelative(.5f, .5f, 0f, false, false, .4f, .8f)
                horizontalLineTo(17f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                verticalLineToRelative(-2f)
            }
}

public val LucideIcons.All.SigmaDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Sigma: ImageVector
    @Composable get() = SigmaDefinition.asImageVector()
