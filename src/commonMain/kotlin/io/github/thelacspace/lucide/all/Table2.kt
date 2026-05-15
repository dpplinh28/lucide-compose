package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Table2") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(9f, 3f)
                horizontalLineTo(5f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(4f)
                moveToRelative(6f, -6f)
                horizontalLineToRelative(10f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(4f)
                moveTo(9f, 3f)
                verticalLineToRelative(18f)
                moveToRelative(0f, 0f)
                horizontalLineToRelative(10f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineTo(9f)
                moveTo(9f, 21f)
                horizontalLineTo(5f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineTo(9f)
                moveToRelative(0f, 0f)
                horizontalLineToRelative(18f)
            }
}

public val LucideIcons.All.Table2Definition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Table2: ImageVector
    @Composable get() = Table2Definition.asImageVector()
