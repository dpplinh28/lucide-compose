package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ArrowUpDown") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(21f, 16f)
                lineToRelative(-4f, 4f)
                lineToRelative(-4f, -4f)
            }
            lucidePath(strokeWidth) {
                moveTo(17f, 20f)
                verticalLineTo(4f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(3f, 8f)
                lineToRelative(4f, -4f)
                lineToRelative(4f, 4f)
            }
            lucidePath(strokeWidth) {
                moveTo(7f, 4f)
                verticalLineToRelative(16f)
            }
}

public val LucideIcons.All.ArrowUpDownDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ArrowUpDown: ImageVector
    @Composable get() = ArrowUpDownDefinition.asImageVector()
