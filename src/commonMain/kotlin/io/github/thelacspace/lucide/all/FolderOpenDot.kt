package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FolderOpenDot") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(6f, 14f)
                lineToRelative(1.45f, -2.9f)
                arcTo(2f, 2f, 0f, false, true, 9.24f, 10f)
                horizontalLineTo(20f)
                arcToRelative(2f, 2f, 0f, false, true, 1.94f, 2.5f)
                lineToRelative(-1.55f, 6f)
                arcToRelative(2f, 2f, 0f, false, true, -1.94f, 1.5f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineTo(5f)
                curveToRelative(0f, -1.1f, .9f, -2f, 2f, -2f)
                horizontalLineToRelative(3.93f)
                arcToRelative(2f, 2f, 0f, false, true, 1.66f, .9f)
                lineToRelative(.82f, 1.2f)
                arcToRelative(2f, 2f, 0f, false, false, 1.66f, .9f)
                horizontalLineTo(18f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(13.0f, 15.0f)
                arcToRelative(1.0f, 1.0f, 0f, true, false, 2.0f, 0f)
                arcToRelative(1.0f, 1.0f, 0f, true, false, -2.0f, 0f)
            }
}

public val LucideIcons.All.FolderOpenDotDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FolderOpenDot: ImageVector
    @Composable get() = FolderOpenDotDefinition.asImageVector()
