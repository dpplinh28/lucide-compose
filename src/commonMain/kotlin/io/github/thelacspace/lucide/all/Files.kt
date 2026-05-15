package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Files") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15f, 2f)
                horizontalLineToRelative(-4f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(11f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(8f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineTo(8f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.706f, 2.706f)
                arcTo(2.4f, 2.4f, 0f, false, false, 15f, 2f)
                verticalLineToRelative(5f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(5f)
                arcToRelative(2.4f, 2.4f, 0f, false, false, -.706f, -1.706f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(5f, 7f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(11f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(8f)
                arcToRelative(2f, 2f, 0f, false, false, 1.732f, -1f)
            }
}

public val LucideIcons.All.FilesDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Files: ImageVector
    @Composable get() = FilesDefinition.asImageVector()
