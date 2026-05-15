package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FolderInput") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2f, 9f)
                verticalLineTo(5f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(3.9f)
                arcToRelative(2f, 2f, 0f, false, true, 1.69f, .9f)
                lineToRelative(.81f, 1.2f)
                arcToRelative(2f, 2f, 0f, false, false, 1.67f, .9f)
                horizontalLineTo(20f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(10f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineToRelative(-1f)
            }
            lucidePath(strokeWidth) {
                moveTo(2f, 13f)
                horizontalLineToRelative(10f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(9f, 16f)
                lineToRelative(3f, -3f)
                lineToRelative(-3f, -3f)
            }
}

public val LucideIcons.All.FolderInputDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FolderInput: ImageVector
    @Composable get() = FolderInputDefinition.asImageVector()
