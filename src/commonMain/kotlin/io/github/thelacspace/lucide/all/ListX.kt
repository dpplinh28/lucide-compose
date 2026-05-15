package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ListX") { strokeWidth ->
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
                moveToRelative(15.5f, 9.5f)
                lineToRelative(5f, 5f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(20.5f, 9.5f)
                lineToRelative(-5f, 5f)
            }
}

public val LucideIcons.All.ListXDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ListX: ImageVector
    @Composable get() = ListXDefinition.asImageVector()
