package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Wine") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(8f, 22f)
                horizontalLineToRelative(8f)
            }
            lucidePath(strokeWidth) {
                moveTo(7f, 10f)
                horizontalLineToRelative(10f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 15f)
                verticalLineToRelative(7f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 15f)
                arcToRelative(5f, 5f, 0f, false, false, 5f, -5f)
                curveToRelative(0f, -2f, -.5f, -4f, -2f, -8f)
                horizontalLineTo(9f)
                curveToRelative(-1.5f, 4f, -2f, 6f, -2f, 8f)
                arcToRelative(5f, 5f, 0f, false, false, 5f, 5f)
                close()
            }
}

public val LucideIcons.All.WineDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Wine: ImageVector
    @Composable get() = WineDefinition.asImageVector()
