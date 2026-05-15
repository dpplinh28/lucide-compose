package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ArrowDownRight") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(7f, 7f)
                lineToRelative(10f, 10f)
            }
            lucidePath(strokeWidth) {
                moveTo(17f, 7f)
                verticalLineToRelative(10f)
                horizontalLineTo(7f)
            }
}

public val LucideIcons.All.ArrowDownRightDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ArrowDownRight: ImageVector
    @Composable get() = ArrowDownRightDefinition.asImageVector()
