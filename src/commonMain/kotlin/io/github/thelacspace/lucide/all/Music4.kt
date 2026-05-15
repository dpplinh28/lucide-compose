package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Music4") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(9f, 18f)
                verticalLineTo(5f)
                lineToRelative(12f, -2f)
                verticalLineToRelative(13f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(9f, 9f)
                lineToRelative(12f, -2f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f, 18.0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, 6.0f, 0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, -6.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f, 16.0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, 6.0f, 0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, -6.0f, 0f)
            }
}

public val LucideIcons.All.Music4Definition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Music4: ImageVector
    @Composable get() = Music4Definition.asImageVector()
