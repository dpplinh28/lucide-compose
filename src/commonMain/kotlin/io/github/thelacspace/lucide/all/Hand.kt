package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Hand") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(18f, 11f)
                verticalLineTo(6f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
            }
            lucidePath(strokeWidth) {
                moveTo(14f, 10f)
                verticalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(10f, 10.5f)
                verticalLineTo(6f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(8f)
            }
            lucidePath(strokeWidth) {
                moveTo(18f, 8f)
                arcToRelative(2f, 2f, 0f, true, true, 4f, 0f)
                verticalLineToRelative(6f)
                arcToRelative(8f, 8f, 0f, false, true, -8f, 8f)
                horizontalLineToRelative(-2f)
                curveToRelative(-2.8f, 0f, -4.5f, -.86f, -5.99f, -2.34f)
                lineToRelative(-3.6f, -3.6f)
                arcToRelative(2f, 2f, 0f, false, true, 2.83f, -2.82f)
                lineTo(7f, 15f)
            }
}

public val LucideIcons.All.HandDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Hand: ImageVector
    @Composable get() = HandDefinition.asImageVector()
