package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Tag") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.586f, 2.586f)
                arcTo(2f, 2f, 0f, false, false, 11.172f, 2f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(7.172f)
                arcToRelative(2f, 2f, 0f, false, false, .586f, 1.414f)
                lineToRelative(8.704f, 8.704f)
                arcToRelative(2.426f, 2.426f, 0f, false, false, 3.42f, 0f)
                lineToRelative(6.58f, -6.58f)
                arcToRelative(2.426f, 2.426f, 0f, false, false, 0f, -3.42f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f, 7.5f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, 1.0f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, -1.0f, 0f)
            }
}

public val LucideIcons.All.TagDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Tag: ImageVector
    @Composable get() = TagDefinition.asImageVector()
