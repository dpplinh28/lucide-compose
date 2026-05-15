package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SquareStack") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4f, 10f)
                curveToRelative(-1.1f, 0f, -2f, -.9f, -2f, -2f)
                verticalLineTo(4f)
                curveToRelative(0f, -1.1f, .9f, -2f, 2f, -2f)
                horizontalLineToRelative(4f)
                curveToRelative(1.1f, 0f, 2f, .9f, 2f, 2f)
            }
            lucidePath(strokeWidth) {
                moveTo(10f, 16f)
                curveToRelative(-1.1f, 0f, -2f, -.9f, -2f, -2f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -1.1f, .9f, -2f, 2f, -2f)
                horizontalLineToRelative(4f)
                curveToRelative(1.1f, 0f, 2f, .9f, 2f, 2f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f, 14.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, 2.0f, 0.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, -2.0f, 0.0f)
                horizontalLineToRelative(-4.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, -2.0f, -0.0f)
                verticalLineToRelative(-8.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, 2.0f, -0.0f)
                close()
            }
}

public val LucideIcons.All.SquareStackDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SquareStack: ImageVector
    @Composable get() = SquareStackDefinition.asImageVector()
