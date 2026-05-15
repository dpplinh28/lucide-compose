package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("TypeOutline") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14f, 16.5f)
                arcToRelative(.5f, .5f, 0f, false, false, .5f, .5f)
                horizontalLineToRelative(.5f)
                arcToRelative(2f, 2f, 0f, false, true, 0f, 4f)
                horizontalLineTo(9f)
                arcToRelative(2f, 2f, 0f, false, true, 0f, -4f)
                horizontalLineToRelative(.5f)
                arcToRelative(.5f, .5f, 0f, false, false, .5f, -.5f)
                verticalLineToRelative(-9f)
                arcToRelative(.5f, .5f, 0f, false, false, -.5f, -.5f)
                horizontalLineToRelative(-3f)
                arcToRelative(.5f, .5f, 0f, false, false, -.5f, .5f)
                verticalLineTo(8f)
                arcToRelative(2f, 2f, 0f, false, true, -4f, 0f)
                verticalLineTo(5f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(16f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(3f)
                arcToRelative(2f, 2f, 0f, false, true, -4f, 0f)
                verticalLineToRelative(-.5f)
                arcToRelative(.5f, .5f, 0f, false, false, -.5f, -.5f)
                horizontalLineToRelative(-3f)
                arcToRelative(.5f, .5f, 0f, false, false, -.5f, .5f)
                close()
            }
}

public val LucideIcons.All.TypeOutlineDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.TypeOutline: ImageVector
    @Composable get() = TypeOutlineDefinition.asImageVector()
