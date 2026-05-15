package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FileDiff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(6f, 22f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(8f)
                arcToRelative(2.4f, 2.4f, 0f, false, true, 1.704f, .706f)
                lineToRelative(3.588f, 3.588f)
                arcTo(2.4f, 2.4f, 0f, false, true, 20f, 8f)
                verticalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 10f)
                horizontalLineToRelative(6f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 13f)
                verticalLineTo(7f)
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 17f)
                horizontalLineToRelative(6f)
            }
}

public val LucideIcons.All.FileDiffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FileDiff: ImageVector
    @Composable get() = FileDiffDefinition.asImageVector()
