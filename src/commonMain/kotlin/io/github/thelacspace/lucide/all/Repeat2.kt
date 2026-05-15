package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Repeat2") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(2f, 9f)
                lineToRelative(3f, -3f)
                lineToRelative(3f, 3f)
            }
            lucidePath(strokeWidth) {
                moveTo(13f, 18f)
                horizontalLineTo(7f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineTo(6f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(22f, 15f)
                lineToRelative(-3f, 3f)
                lineToRelative(-3f, -3f)
            }
            lucidePath(strokeWidth) {
                moveTo(11f, 6f)
                horizontalLineToRelative(6f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(10f)
            }
}

public val LucideIcons.All.Repeat2Definition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Repeat2: ImageVector
    @Composable get() = Repeat2Definition.asImageVector()
