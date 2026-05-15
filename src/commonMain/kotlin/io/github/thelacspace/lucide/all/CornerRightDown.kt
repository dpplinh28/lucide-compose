package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CornerRightDown") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(10f, 15f)
                lineToRelative(5f, 5f)
                lineToRelative(5f, -5f)
            }
            lucidePath(strokeWidth) {
                moveTo(4f, 4f)
                horizontalLineToRelative(7f)
                arcToRelative(4f, 4f, 0f, false, true, 4f, 4f)
                verticalLineToRelative(12f)
            }
}

public val LucideIcons.All.CornerRightDownDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CornerRightDown: ImageVector
    @Composable get() = CornerRightDownDefinition.asImageVector()
