package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SquareM") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(8f, 16f)
                verticalLineTo(8.5f)
                arcToRelative(.5f, .5f, 0f, false, true, .9f, -.3f)
                lineToRelative(2.7f, 3.599f)
                arcToRelative(.5f, .5f, 0f, false, false, .8f, 0f)
                lineToRelative(2.7f, -3.6f)
                arcToRelative(.5f, .5f, 0f, false, true, .9f, .3f)
                verticalLineTo(16f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f, 3.0f)
                horizontalLineToRelative(14.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, 2.0f, 0.0f)
                verticalLineToRelative(18.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, -2.0f, 0.0f)
                horizontalLineToRelative(-14.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, -2.0f, -0.0f)
                verticalLineToRelative(-18.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, 2.0f, -0.0f)
                close()
            }
}

public val LucideIcons.All.SquareMDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SquareM: ImageVector
    @Composable get() = SquareMDefinition.asImageVector()
