package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MirrorRectangular") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11f, 6f)
                lineTo(8f, 9f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(16f, 7f)
                lineToRelative(-8f, 8f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f, 2.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, 2.0f, 0.0f)
                verticalLineToRelative(20.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, -2.0f, 0.0f)
                horizontalLineToRelative(-12.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, -2.0f, -0.0f)
                verticalLineToRelative(-20.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, 2.0f, -0.0f)
                close()
            }
}

public val LucideIcons.All.MirrorRectangularDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MirrorRectangular: ImageVector
    @Composable get() = MirrorRectangularDefinition.asImageVector()
