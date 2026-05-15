package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FolderRoot") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4f, 20f)
                horizontalLineToRelative(16f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineTo(8f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                horizontalLineToRelative(-7.93f)
                arcToRelative(2f, 2f, 0f, false, true, -1.66f, -.9f)
                lineToRelative(-.82f, -1.2f)
                arcTo(2f, 2f, 0f, false, false, 7.93f, 3f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(13f)
                curveToRelative(0f, 1.1f, .9f, 2f, 2f, 2f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f, 13.0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, 4.0f, 0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, -4.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 15f)
                verticalLineToRelative(5f)
            }
}

public val LucideIcons.All.FolderRootDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FolderRoot: ImageVector
    @Composable get() = FolderRootDefinition.asImageVector()
