package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CopyMinus") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 15f)
                lineTo(18f, 15f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f, 8.0f)
                horizontalLineToRelative(10.0f)
                arcToRelative(2.0f, 2.0f, 0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(10.0f)
                arcToRelative(2.0f, 2.0f, 0f, false, true, -2.0f, 2.0f)
                horizontalLineToRelative(-10.0f)
                arcToRelative(2.0f, 2.0f, 0f, false, true, -2.0f, -2.0f)
                verticalLineToRelative(-10.0f)
                arcToRelative(2.0f, 2.0f, 0f, false, true, 2.0f, -2.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(4f, 16f)
                curveToRelative(-1.1f, 0f, -2f, -.9f, -2f, -2f)
                verticalLineTo(4f)
                curveToRelative(0f, -1.1f, .9f, -2f, 2f, -2f)
                horizontalLineToRelative(10f)
                curveToRelative(1.1f, 0f, 2f, .9f, 2f, 2f)
            }
}

public val LucideIcons.All.CopyMinusDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CopyMinus: ImageVector
    @Composable get() = CopyMinusDefinition.asImageVector()
