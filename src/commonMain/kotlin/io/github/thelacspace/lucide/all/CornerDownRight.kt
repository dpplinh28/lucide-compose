package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CornerDownRight") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(15f, 10f)
                lineToRelative(5f, 5f)
                lineToRelative(-5f, 5f)
            }
            lucidePath(strokeWidth) {
                moveTo(4f, 4f)
                verticalLineToRelative(7f)
                arcToRelative(4f, 4f, 0f, false, false, 4f, 4f)
                horizontalLineToRelative(12f)
            }
}

public val LucideIcons.All.CornerDownRightDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CornerDownRight: ImageVector
    @Composable get() = CornerDownRightDefinition.asImageVector()
