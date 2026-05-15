package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("StickyNoteOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15f, 3f)
                verticalLineToRelative(5f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(5f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(2f, 2f)
                lineToRelative(20f, 20f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.586f, 3.586f)
                arcTo(2f, 2f, 0f, false, false, 3f, 5f)
                verticalLineToRelative(14f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(14f)
                arcToRelative(2f, 2f, 0f, false, false, 1.414f, -.586f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.656f, 3f)
                horizontalLineTo(15f)
                arcToRelative(2.4f, 2.4f, 0f, false, true, 1.706f, .706f)
                lineToRelative(3.588f, 3.588f)
                arcTo(2.4f, 2.4f, 0f, false, true, 21f, 9f)
                verticalLineToRelative(6.344f)
            }
}

public val LucideIcons.All.StickyNoteOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.StickyNoteOff: ImageVector
    @Composable get() = StickyNoteOffDefinition.asImageVector()
