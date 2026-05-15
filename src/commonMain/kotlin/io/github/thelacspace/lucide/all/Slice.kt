package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Slice") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11f, 16.586f)
                verticalLineTo(19f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                horizontalLineTo(2f)
                lineTo(18.37f, 3.63f)
                arcToRelative(1f, 1f, 0f, true, true, 3f, 3f)
                lineToRelative(-9.663f, 9.663f)
                arcToRelative(1f, 1f, 0f, false, true, -1.414f, 0f)
                lineTo(8f, 14f)
            }
}

public val LucideIcons.All.SliceDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Slice: ImageVector
    @Composable get() = SliceDefinition.asImageVector()
