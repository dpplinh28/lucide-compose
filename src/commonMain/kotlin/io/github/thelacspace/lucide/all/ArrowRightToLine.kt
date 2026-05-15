package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ArrowRightToLine") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(17f, 12f)
                horizontalLineTo(3f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(11f, 18f)
                lineToRelative(6f, -6f)
                lineToRelative(-6f, -6f)
            }
            lucidePath(strokeWidth) {
                moveTo(21f, 5f)
                verticalLineToRelative(14f)
            }
}

public val LucideIcons.All.ArrowRightToLineDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ArrowRightToLine: ImageVector
    @Composable get() = ArrowRightToLineDefinition.asImageVector()
