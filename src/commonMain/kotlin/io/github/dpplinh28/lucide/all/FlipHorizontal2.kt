package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

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
