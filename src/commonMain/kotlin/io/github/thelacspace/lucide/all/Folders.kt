package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Folders") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(20f, 5f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(7f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineTo(9f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineTo(5f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(2.5f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 1.2f, .6f)
                lineToRelative(.6f, .8f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 1.2f, .6f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 8.268f)
                arcToRelative(2f, 2f, 0f, false, false, -1f, 1.738f)
                verticalLineTo(19f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(11f)
                arcToRelative(2f, 2f, 0f, false, false, 1.732f, -1f)
            }
}

public val LucideIcons.All.FoldersDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Folders: ImageVector
    @Composable get() = FoldersDefinition.asImageVector()
