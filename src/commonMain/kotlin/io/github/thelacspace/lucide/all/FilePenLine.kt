package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FilePenLine") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14.364f, 13.634f)
                arcToRelative(2f, 2f, 0f, false, false, -.506f, .854f)
                lineToRelative(-.837f, 2.87f)
                arcToRelative(.5f, .5f, 0f, false, false, .62f, .62f)
                lineToRelative(2.87f, -.837f)
                arcToRelative(2f, 2f, 0f, false, false, .854f, -.506f)
                lineToRelative(4.013f, -4.009f)
                arcToRelative(1f, 1f, 0f, false, false, -3.004f, -3.004f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(14.487f, 7.858f)
                arcTo(1f, 1f, 0f, false, true, 14f, 7f)
                verticalLineTo(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(20f, 19.645f)
                verticalLineTo(20f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineTo(6f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(8f)
                arcToRelative(2.4f, 2.4f, 0f, false, true, 1.704f, .706f)
                lineToRelative(2.516f, 2.516f)
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 18f)
                horizontalLineToRelative(1f)
            }
}

public val LucideIcons.All.FilePenLineDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FilePenLine: ImageVector
    @Composable get() = FilePenLineDefinition.asImageVector()
