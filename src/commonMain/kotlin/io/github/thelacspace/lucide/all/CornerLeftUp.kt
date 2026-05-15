package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CornerLeftUp") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14f, 9f)
                lineTo(9f, 4f)
                lineTo(4f, 9f)
            }
            lucidePath(strokeWidth) {
                moveTo(20f, 20f)
                horizontalLineToRelative(-7f)
                arcToRelative(4f, 4f, 0f, false, true, -4f, -4f)
                verticalLineTo(4f)
            }
}

public val LucideIcons.All.CornerLeftUpDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CornerLeftUp: ImageVector
    @Composable get() = CornerLeftUpDefinition.asImageVector()
