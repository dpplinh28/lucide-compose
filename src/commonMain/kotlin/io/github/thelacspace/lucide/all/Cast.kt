package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Cast") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2f, 8f)
                verticalLineTo(6f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(16f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineToRelative(-6f)
            }
            lucidePath(strokeWidth) {
                moveTo(2f, 12f)
                arcToRelative(9f, 9f, 0f, false, true, 8f, 8f)
            }
            lucidePath(strokeWidth) {
                moveTo(2f, 16f)
                arcToRelative(5f, 5f, 0f, false, true, 4f, 4f)
            }
            lucidePath(strokeWidth) {
                moveTo(2f, 20f)
                lineTo(2.01f, 20f)
            }
}

public val LucideIcons.All.CastDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Cast: ImageVector
    @Composable get() = CastDefinition.asImageVector()
