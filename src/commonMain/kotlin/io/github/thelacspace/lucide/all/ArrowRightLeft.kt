package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ArrowRightLeft") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(16f, 3f)
                lineToRelative(4f, 4f)
                lineToRelative(-4f, 4f)
            }
            lucidePath(strokeWidth) {
                moveTo(20f, 7f)
                horizontalLineTo(4f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(8f, 21f)
                lineToRelative(-4f, -4f)
                lineToRelative(4f, -4f)
            }
            lucidePath(strokeWidth) {
                moveTo(4f, 17f)
                horizontalLineToRelative(16f)
            }
}

public val LucideIcons.All.ArrowRightLeftDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ArrowRightLeft: ImageVector
    @Composable get() = ArrowRightLeftDefinition.asImageVector()
