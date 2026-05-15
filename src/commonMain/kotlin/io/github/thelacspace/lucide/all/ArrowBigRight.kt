package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ArrowBigRight") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(13.207f, 19.793f)
                arcToRelative(.707f, .707f, 0f, false, true, -1.207f, -.5f)
                verticalLineTo(16f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                horizontalLineTo(5f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                verticalLineToRelative(-4f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                horizontalLineToRelative(6f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                verticalLineTo(4.707f)
                arcToRelative(.707f, .707f, 0f, false, true, 1.207f, -.5f)
                lineToRelative(6.94f, 6.94f)
                arcToRelative(1.207f, 1.207f, 0f, false, true, 0f, 1.707f)
                close()
            }
}

public val LucideIcons.All.ArrowBigRightDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ArrowBigRight: ImageVector
    @Composable get() = ArrowBigRightDefinition.asImageVector()
