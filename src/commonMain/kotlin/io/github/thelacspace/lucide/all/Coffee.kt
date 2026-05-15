package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Coffee") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10f, 2f)
                verticalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(14f, 2f)
                verticalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 8f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(8f)
                arcToRelative(4f, 4f, 0f, false, true, -4f, 4f)
                horizontalLineTo(7f)
                arcToRelative(4f, 4f, 0f, false, true, -4f, -4f)
                verticalLineTo(9f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                horizontalLineToRelative(14f)
                arcToRelative(4f, 4f, 0f, true, true, 0f, 8f)
                horizontalLineToRelative(-1f)
            }
            lucidePath(strokeWidth) {
                moveTo(6f, 2f)
                verticalLineToRelative(2f)
            }
}

public val LucideIcons.All.CoffeeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Coffee: ImageVector
    @Composable get() = CoffeeDefinition.asImageVector()
