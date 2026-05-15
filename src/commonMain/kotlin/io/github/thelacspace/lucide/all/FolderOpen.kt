package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FolderOpen") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(6f, 14f)
                lineToRelative(1.5f, -2.9f)
                arcTo(2f, 2f, 0f, false, true, 9.24f, 10f)
                horizontalLineTo(20f)
                arcToRelative(2f, 2f, 0f, false, true, 1.94f, 2.5f)
                lineToRelative(-1.54f, 6f)
                arcToRelative(2f, 2f, 0f, false, true, -1.95f, 1.5f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineTo(5f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(3.9f)
                arcToRelative(2f, 2f, 0f, false, true, 1.69f, .9f)
                lineToRelative(.81f, 1.2f)
                arcToRelative(2f, 2f, 0f, false, false, 1.67f, .9f)
                horizontalLineTo(18f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(2f)
            }
}

public val LucideIcons.All.FolderOpenDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FolderOpen: ImageVector
    @Composable get() = FolderOpenDefinition.asImageVector()
