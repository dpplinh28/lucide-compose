package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MoveVertical") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 2f)
                verticalLineToRelative(20f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(8f, 18f)
                lineToRelative(4f, 4f)
                lineToRelative(4f, -4f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(8f, 6f)
                lineToRelative(4f, -4f)
                lineToRelative(4f, 4f)
            }
}

public val LucideIcons.All.MoveVerticalDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MoveVertical: ImageVector
    @Composable get() = MoveVerticalDefinition.asImageVector()
