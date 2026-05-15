package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("TextAlignCenter") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(21f, 5f)
                horizontalLineTo(3f)
            }
            lucidePath(strokeWidth) {
                moveTo(17f, 12f)
                horizontalLineTo(7f)
            }
            lucidePath(strokeWidth) {
                moveTo(19f, 19f)
                horizontalLineTo(5f)
            }
}

public val LucideIcons.All.TextAlignCenterDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.TextAlignCenter: ImageVector
    @Composable get() = TextAlignCenterDefinition.asImageVector()
