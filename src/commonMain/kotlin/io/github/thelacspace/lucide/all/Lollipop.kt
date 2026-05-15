package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Lollipop") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3.0f, 11.0f)
                arcToRelative(8.0f, 8.0f, 0f, true, false, 16.0f, 0f)
                arcToRelative(8.0f, 8.0f, 0f, true, false, -16.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(21f, 21f)
                lineToRelative(-4.3f, -4.3f)
            }
            lucidePath(strokeWidth) {
                moveTo(11f, 11f)
                arcToRelative(2f, 2f, 0f, false, false, 4f, 0f)
                arcToRelative(4f, 4f, 0f, false, false, -8f, 0f)
                arcToRelative(6f, 6f, 0f, false, false, 12f, 0f)
            }
}

public val LucideIcons.All.LollipopDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Lollipop: ImageVector
    @Composable get() = LollipopDefinition.asImageVector()
