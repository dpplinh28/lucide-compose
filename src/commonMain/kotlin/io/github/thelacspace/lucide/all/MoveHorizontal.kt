package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MoveHorizontal") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(18f, 8f)
                lineToRelative(4f, 4f)
                lineToRelative(-4f, 4f)
            }
            lucidePath(strokeWidth) {
                moveTo(2f, 12f)
                horizontalLineToRelative(20f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(6f, 8f)
                lineToRelative(-4f, 4f)
                lineToRelative(4f, 4f)
            }
}

public val LucideIcons.All.MoveHorizontalDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MoveHorizontal: ImageVector
    @Composable get() = MoveHorizontalDefinition.asImageVector()
