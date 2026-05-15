package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FolderSync") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(9f, 20f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineTo(5f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(3.9f)
                arcToRelative(2f, 2f, 0f, false, true, 1.69f, .9f)
                lineToRelative(.81f, 1.2f)
                arcToRelative(2f, 2f, 0f, false, false, 1.67f, .9f)
                horizontalLineTo(20f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 10f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(12f, 14f)
                lineToRelative(1.535f, -1.605f)
                arcToRelative(5f, 5f, 0f, false, true, 8f, 1.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(22f, 22f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-4f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(22f, 18f)
                lineToRelative(-1.535f, 1.605f)
                arcToRelative(5f, 5f, 0f, false, true, -8f, -1.5f)
            }
}

public val LucideIcons.All.FolderSyncDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FolderSync: ImageVector
    @Composable get() = FolderSyncDefinition.asImageVector()
