package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Hexagon") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(21f, 16f)
                verticalLineTo(8f)
                arcToRelative(2f, 2f, 0f, false, false, -1f, -1.73f)
                lineToRelative(-7f, -4f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 0f)
                lineToRelative(-7f, 4f)
                arcTo(2f, 2f, 0f, false, false, 3f, 8f)
                verticalLineToRelative(8f)
                arcToRelative(2f, 2f, 0f, false, false, 1f, 1.73f)
                lineToRelative(7f, 4f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 0f)
                lineToRelative(7f, -4f)
                arcTo(2f, 2f, 0f, false, false, 21f, 16f)
                close()
            }
}

public val LucideIcons.All.HexagonDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Hexagon: ImageVector
    @Composable get() = HexagonDefinition.asImageVector()
