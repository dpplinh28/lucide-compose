package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FlipHorizontal2") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(3f, 7f)
                lineToRelative(5f, 5f)
                lineToRelative(-5f, 5f)
                verticalLineTo(7f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(21f, 7f)
                lineToRelative(-5f, 5f)
                lineToRelative(5f, 5f)
                verticalLineTo(7f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 20f)
                verticalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 14f)
                verticalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 8f)
                verticalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 2f)
                verticalLineToRelative(2f)
            }
}

public val LucideIcons.All.FlipHorizontal2Definition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FlipHorizontal2: ImageVector
    @Composable get() = FlipHorizontal2Definition.asImageVector()
