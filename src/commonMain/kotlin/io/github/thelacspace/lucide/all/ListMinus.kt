package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ListMinus") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16f, 5f)
                horizontalLineTo(3f)
            }
            lucidePath(strokeWidth) {
                moveTo(11f, 12f)
                horizontalLineTo(3f)
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 19f)
                horizontalLineTo(3f)
            }
            lucidePath(strokeWidth) {
                moveTo(21f, 12f)
                horizontalLineToRelative(-6f)
            }
}

public val LucideIcons.All.ListMinusDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ListMinus: ImageVector
    @Composable get() = ListMinusDefinition.asImageVector()
