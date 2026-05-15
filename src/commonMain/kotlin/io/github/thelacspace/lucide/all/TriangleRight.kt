package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("TriangleRight") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(22f, 18f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineTo(3f)
                curveToRelative(-1.1f, 0f, -1.3f, -.6f, -.4f, -1.3f)
                lineTo(20.4f, 4.3f)
                curveToRelative(.9f, -.7f, 1.6f, -.4f, 1.6f, .7f)
                close()
            }
}

public val LucideIcons.All.TriangleRightDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.TriangleRight: ImageVector
    @Composable get() = TriangleRightDefinition.asImageVector()
