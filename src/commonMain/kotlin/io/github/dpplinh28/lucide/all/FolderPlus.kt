package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FolderPlus") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 10f)
                verticalLineToRelative(6f)
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 13f)
                horizontalLineToRelative(6f)
            }
            lucidePath(strokeWidth) {
                moveTo(20f, 20f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineTo(8f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                horizontalLineToRelative(-7.9f)
                arcToRelative(2f, 2f, 0f, false, true, -1.69f, -.9f)
                lineTo(9.6f, 3.9f)
                arcTo(2f, 2f, 0f, false, false, 7.93f, 3f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(13f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                close()
            }
}

public val LucideIcons.All.FolderPlusDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FolderPlus: ImageVector
    @Composable get() = FolderPlusDefinition.asImageVector()
