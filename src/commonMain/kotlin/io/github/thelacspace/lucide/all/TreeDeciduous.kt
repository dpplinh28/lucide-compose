package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("TreeDeciduous") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(8f, 19f)
                arcToRelative(4f, 4f, 0f, false, true, -2.24f, -7.32f)
                arcTo(3.5f, 3.5f, 0f, false, true, 9f, 6.03f)
                verticalLineTo(6f)
                arcToRelative(3f, 3f, 0f, true, true, 6f, 0f)
                verticalLineToRelative(.04f)
                arcToRelative(3.5f, 3.5f, 0f, false, true, 3.24f, 5.65f)
                arcTo(4f, 4f, 0f, false, true, 16f, 19f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 19f)
                verticalLineToRelative(3f)
            }
}

public val LucideIcons.All.TreeDeciduousDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.TreeDeciduous: ImageVector
    @Composable get() = TreeDeciduousDefinition.asImageVector()
