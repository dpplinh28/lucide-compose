package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FolderPen") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2f, 11.5f)
                verticalLineTo(5f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(3.9f)
                curveToRelative(.7f, 0f, 1.3f, .3f, 1.7f, .9f)
                lineToRelative(.8f, 1.2f)
                curveToRelative(.4f, .6f, 1f, .9f, 1.7f, .9f)
                horizontalLineTo(20f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(10f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineToRelative(-9.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(11.378f, 13.626f)
                arcToRelative(1f, 1f, 0f, true, false, -3.004f, -3.004f)
                lineToRelative(-5.01f, 5.012f)
                arcToRelative(2f, 2f, 0f, false, false, -.506f, .854f)
                lineToRelative(-.837f, 2.87f)
                arcToRelative(.5f, .5f, 0f, false, false, .62f, .62f)
                lineToRelative(2.87f, -.837f)
                arcToRelative(2f, 2f, 0f, false, false, .854f, -.506f)
                close()
            }
}

public val LucideIcons.All.FolderPenDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FolderPen: ImageVector
    @Composable get() = FolderPenDefinition.asImageVector()
