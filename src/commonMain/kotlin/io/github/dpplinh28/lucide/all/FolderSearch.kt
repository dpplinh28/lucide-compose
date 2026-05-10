package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FolderSearch") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.7f, 20f)
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
                verticalLineToRelative(4.1f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(21f, 21f)
                lineToRelative(-1.9f, -1.9f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f, 17.0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, 6.0f, 0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, -6.0f, 0f)
            }
}

public val LucideIcons.All.FolderSearchDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FolderSearch: ImageVector
    @Composable get() = FolderSearchDefinition.asImageVector()
