package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("StickyNoteCheck") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(15f, 19f)
                lineToRelative(2f, 2f)
                lineToRelative(4f, -4f)
            }
            lucidePath(strokeWidth) {
                moveTo(15f, 3f)
                verticalLineToRelative(5f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(5f)
            }
            lucidePath(strokeWidth) {
                moveTo(21f, 13f)
                verticalLineTo(9f)
                arcToRelative(2.4f, 2.4f, 0f, false, false, -.706f, -1.706f)
                lineToRelative(-3.588f, -3.588f)
                arcTo(2.4f, 2.4f, 0f, false, false, 15f, 3f)
                horizontalLineTo(5f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(14f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(6.5f)
            }
}

public val LucideIcons.All.StickyNoteCheckDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.StickyNoteCheck: ImageVector
    @Composable get() = StickyNoteCheckDefinition.asImageVector()
