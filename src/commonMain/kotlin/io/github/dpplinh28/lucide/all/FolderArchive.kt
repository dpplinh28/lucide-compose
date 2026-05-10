package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FolderArchive") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(13.0f, 19.0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, 4.0f, 0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, -4.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.9f, 19.8f)
                arcTo(2f, 2f, 0f, false, false, 22f, 18f)
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
                horizontalLineToRelative(5.1f)
            }
            lucidePath(strokeWidth) {
                moveTo(15f, 11f)
                verticalLineToRelative(-1f)
            }
            lucidePath(strokeWidth) {
                moveTo(15f, 17f)
                verticalLineToRelative(-2f)
            }
}

public val LucideIcons.All.FolderArchiveDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FolderArchive: ImageVector
    @Composable get() = FolderArchiveDefinition.asImageVector()
