package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FileHeart") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(13f, 22f)
                horizontalLineToRelative(5f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineTo(8f)
                arcToRelative(2.4f, 2.4f, 0f, false, false, -.706f, -1.706f)
                lineToRelative(-3.588f, -3.588f)
                arcTo(2.4f, 2.4f, 0f, false, false, 14f, 2f)
                horizontalLineTo(6f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(7f)
            }
            lucidePath(strokeWidth) {
                moveTo(14f, 2f)
                verticalLineToRelative(5f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(5f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.62f, 18.8f)
                arcTo(2.25f, 2.25f, 0f, true, true, 7f, 15.836f)
                arcToRelative(2.25f, 2.25f, 0f, true, true, 3.38f, 2.966f)
                lineToRelative(-2.626f, 2.856f)
                arcToRelative(1f, 1f, 0f, false, true, -1.507f, 0f)
                close()
            }
}

public val LucideIcons.All.FileHeartDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FileHeart: ImageVector
    @Composable get() = FileHeartDefinition.asImageVector()
