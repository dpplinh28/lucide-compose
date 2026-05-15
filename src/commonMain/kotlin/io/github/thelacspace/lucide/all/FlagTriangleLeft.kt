package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FlagTriangleLeft") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(18f, 22f)
                verticalLineTo(2.8f)
                arcToRelative(.8f, .8f, 0f, false, false, -1.17f, -.71f)
                lineTo(5.45f, 7.78f)
                arcToRelative(.8f, .8f, 0f, false, false, 0f, 1.44f)
                lineTo(18f, 15.5f)
            }
}

public val LucideIcons.All.FlagTriangleLeftDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FlagTriangleLeft: ImageVector
    @Composable get() = FlagTriangleLeftDefinition.asImageVector()
