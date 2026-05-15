package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FolderHeart") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.638f, 20f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineTo(5f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(3.9f)
                arcToRelative(2f, 2f, 0f, false, true, 1.69f, .9f)
                lineToRelative(.81f, 1.2f)
                arcToRelative(2f, 2f, 0f, false, false, 1.67f, .9f)
                horizontalLineTo(20f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(3.417f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.62f, 18.8f)
                arcTo(2.25f, 2.25f, 0f, true, true, 18f, 15.836f)
                arcToRelative(2.25f, 2.25f, 0f, true, true, 3.38f, 2.966f)
                lineToRelative(-2.626f, 2.856f)
                arcToRelative(.998f, .998f, 0f, false, true, -1.507f, 0f)
                close()
            }
}

public val LucideIcons.All.FolderHeartDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FolderHeart: ImageVector
    @Composable get() = FolderHeartDefinition.asImageVector()
