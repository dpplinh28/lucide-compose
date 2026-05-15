package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ListCheck") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16f, 5f)
                horizontalLineTo(3f)
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 12f)
                horizontalLineTo(3f)
            }
            lucidePath(strokeWidth) {
                moveTo(11f, 19f)
                horizontalLineTo(3f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(15f, 18f)
                lineToRelative(2f, 2f)
                lineToRelative(4f, -4f)
            }
}

public val LucideIcons.All.ListCheckDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ListCheck: ImageVector
    @Composable get() = ListCheckDefinition.asImageVector()
