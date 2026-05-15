package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Tags") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(13.172f, 2f)
                arcToRelative(2f, 2f, 0f, false, true, 1.414f, .586f)
                lineToRelative(6.71f, 6.71f)
                arcToRelative(2.4f, 2.4f, 0f, false, true, 0f, 3.408f)
                lineToRelative(-4.592f, 4.592f)
                arcToRelative(2.4f, 2.4f, 0f, false, true, -3.408f, 0f)
                lineToRelative(-6.71f, -6.71f)
                arcTo(2f, 2f, 0f, false, true, 6f, 9.172f)
                verticalLineTo(3f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(2f, 7f)
                verticalLineToRelative(6.172f)
                arcToRelative(2f, 2f, 0f, false, false, .586f, 1.414f)
                lineToRelative(6.71f, 6.71f)
                arcToRelative(2.4f, 2.4f, 0f, false, false, 3.191f, .193f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f, 6.5f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, 1.0f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, -1.0f, 0f)
            }
}

public val LucideIcons.All.TagsDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Tags: ImageVector
    @Composable get() = TagsDefinition.asImageVector()
