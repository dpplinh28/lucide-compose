package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MoveDiagonal2") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(19f, 13f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-6f)
            }
            lucidePath(strokeWidth) {
                moveTo(5f, 11f)
                verticalLineTo(5f)
                horizontalLineToRelative(6f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(5f, 5f)
                lineToRelative(14f, 14f)
            }
}

public val LucideIcons.All.MoveDiagonal2Definition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MoveDiagonal2: ImageVector
    @Composable get() = MoveDiagonal2Definition.asImageVector()
