package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FolderKey") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(13f, 20f)
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
                verticalLineToRelative(1.36f)
            }
            lucidePath(strokeWidth) {
                moveTo(19f, 12f)
                verticalLineToRelative(6f)
            }
            lucidePath(strokeWidth) {
                moveTo(19f, 14f)
                horizontalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0f, 20.0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, 4.0f, 0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, -4.0f, 0f)
            }
}

public val LucideIcons.All.FolderKeyDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FolderKey: ImageVector
    @Composable get() = FolderKeyDefinition.asImageVector()
