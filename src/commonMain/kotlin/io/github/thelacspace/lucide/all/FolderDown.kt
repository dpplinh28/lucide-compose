package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FolderDown") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(20f, 20f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineTo(8f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                horizontalLineToRelative(-7.9f)
                arcToRelative(2f, 2f, 0f, false, true, -1.69f, -.9f)
                lineTo(9.6f, 3.9f)
                arcTo(2f, 2f, 0f, false, false, 7.93f, 3f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(13f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 10f)
                verticalLineToRelative(6f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(15f, 13f)
                lineToRelative(-3f, 3f)
                lineToRelative(-3f, -3f)
            }
}

public val LucideIcons.All.FolderDownDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FolderDown: ImageVector
    @Composable get() = FolderDownDefinition.asImageVector()
