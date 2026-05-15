package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MoveDownRight") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(19f, 13f)
                verticalLineTo(19f)
                horizontalLineTo(13f)
            }
            lucidePath(strokeWidth) {
                moveTo(5f, 5f)
                lineTo(19f, 19f)
            }
}

public val LucideIcons.All.MoveDownRightDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MoveDownRight: ImageVector
    @Composable get() = MoveDownRightDefinition.asImageVector()
