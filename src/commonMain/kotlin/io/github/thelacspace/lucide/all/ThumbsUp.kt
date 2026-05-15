package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ThumbsUp") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15f, 5.88f)
                lineTo(14f, 10f)
                horizontalLineToRelative(5.83f)
                arcToRelative(2f, 2f, 0f, false, true, 1.92f, 2.56f)
                lineToRelative(-2.33f, 8f)
                arcTo(2f, 2f, 0f, false, true, 17.5f, 22f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineToRelative(-8f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(2.76f)
                arcToRelative(2f, 2f, 0f, false, false, 1.79f, -1.11f)
                lineTo(12f, 2f)
                arcToRelative(3.13f, 3.13f, 0f, false, true, 3f, 3.88f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(7f, 10f)
                verticalLineToRelative(12f)
            }
}

public val LucideIcons.All.ThumbsUpDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ThumbsUp: ImageVector
    @Composable get() = ThumbsUpDefinition.asImageVector()
