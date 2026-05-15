package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ArrowDownUp") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(3f, 16f)
                lineToRelative(4f, 4f)
                lineToRelative(4f, -4f)
            }
            lucidePath(strokeWidth) {
                moveTo(7f, 20f)
                verticalLineTo(4f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(21f, 8f)
                lineToRelative(-4f, -4f)
                lineToRelative(-4f, 4f)
            }
            lucidePath(strokeWidth) {
                moveTo(17f, 4f)
                verticalLineToRelative(16f)
            }
}

public val LucideIcons.All.ArrowDownUpDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ArrowDownUp: ImageVector
    @Composable get() = ArrowDownUpDefinition.asImageVector()
