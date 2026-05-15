package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SquareArrowOutUpLeft") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(13f, 3f)
                horizontalLineToRelative(6f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(14f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineTo(5f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineToRelative(-6f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(3f, 3f)
                lineToRelative(9f, 9f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 9f)
                verticalLineTo(3f)
                horizontalLineToRelative(6f)
            }
}

public val LucideIcons.All.SquareArrowOutUpLeftDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SquareArrowOutUpLeft: ImageVector
    @Composable get() = SquareArrowOutUpLeftDefinition.asImageVector()
