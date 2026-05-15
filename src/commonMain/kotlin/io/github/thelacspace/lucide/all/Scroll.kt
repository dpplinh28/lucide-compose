package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Scroll") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(19f, 17f)
                verticalLineTo(5f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                horizontalLineTo(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 21f)
                horizontalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineToRelative(-1f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                horizontalLineTo(11f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(1f)
                arcToRelative(2f, 2f, 0f, true, true, -4f, 0f)
                verticalLineTo(5f)
                arcToRelative(2f, 2f, 0f, true, false, -4f, 0f)
                verticalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(3f)
            }
}

public val LucideIcons.All.ScrollDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Scroll: ImageVector
    @Composable get() = ScrollDefinition.asImageVector()
