package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FolderTree") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(20f, 10f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                verticalLineTo(6f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                horizontalLineToRelative(-2.5f)
                arcToRelative(1f, 1f, 0f, false, true, -.8f, -.4f)
                lineToRelative(-.9f, -1.2f)
                arcTo(1f, 1f, 0f, false, false, 15f, 3f)
                horizontalLineToRelative(-2f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(5f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(20f, 21f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                verticalLineToRelative(-3f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                horizontalLineToRelative(-2.9f)
                arcToRelative(1f, 1f, 0f, false, true, -.88f, -.55f)
                lineToRelative(-.42f, -.85f)
                arcToRelative(1f, 1f, 0f, false, false, -.92f, -.6f)
                horizontalLineTo(13f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(5f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 5f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(3f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 3f)
                verticalLineToRelative(13f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(3f)
            }
}

public val LucideIcons.All.FolderTreeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FolderTree: ImageVector
    @Composable get() = FolderTreeDefinition.asImageVector()
