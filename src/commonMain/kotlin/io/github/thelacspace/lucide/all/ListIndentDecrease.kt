package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ListIndentDecrease") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(21f, 5f)
                horizontalLineTo(11f)
            }
            lucidePath(strokeWidth) {
                moveTo(21f, 12f)
                horizontalLineTo(11f)
            }
            lucidePath(strokeWidth) {
                moveTo(21f, 19f)
                horizontalLineTo(11f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(7f, 8f)
                lineToRelative(-4f, 4f)
                lineToRelative(4f, 4f)
            }
}

public val LucideIcons.All.ListIndentDecreaseDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ListIndentDecrease: ImageVector
    @Composable get() = ListIndentDecreaseDefinition.asImageVector()
