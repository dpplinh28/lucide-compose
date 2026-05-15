package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ArrowDownFromLine") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(19f, 3f)
                horizontalLineTo(5f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 21f)
                verticalLineTo(7f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(6f, 15f)
                lineToRelative(6f, 6f)
                lineToRelative(6f, -6f)
            }
}

public val LucideIcons.All.ArrowDownFromLineDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ArrowDownFromLine: ImageVector
    @Composable get() = ArrowDownFromLineDefinition.asImageVector()
