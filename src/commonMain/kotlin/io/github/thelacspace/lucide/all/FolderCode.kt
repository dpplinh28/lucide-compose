package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FolderCode") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10f, 10.5f)
                lineTo(8f, 13f)
                lineToRelative(2f, 2.5f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(14f, 10.5f)
                lineToRelative(2f, 2.5f)
                lineToRelative(-2f, 2.5f)
            }
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
}

public val LucideIcons.All.FolderCodeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FolderCode: ImageVector
    @Composable get() = FolderCodeDefinition.asImageVector()
