package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Omega") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3f, 20f)
                horizontalLineToRelative(4.5f)
                arcToRelative(.5f, .5f, 0f, false, false, .5f, -.5f)
                verticalLineToRelative(-.282f)
                arcToRelative(.52f, .52f, 0f, false, false, -.247f, -.437f)
                arcToRelative(8f, 8f, 0f, true, true, 8.494f, -.001f)
                arcToRelative(.52f, .52f, 0f, false, false, -.247f, .438f)
                verticalLineToRelative(.282f)
                arcToRelative(.5f, .5f, 0f, false, false, .5f, .5f)
                horizontalLineTo(21f)
            }
}

public val LucideIcons.All.OmegaDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Omega: ImageVector
    @Composable get() = OmegaDefinition.asImageVector()
