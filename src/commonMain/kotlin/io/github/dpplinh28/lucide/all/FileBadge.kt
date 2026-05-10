package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FileBadge") { strokeWidth ->
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
                verticalLineToRelative(3.3f)
            }
            lucidePath(strokeWidth) {
                moveTo(14f, 2f)
                verticalLineToRelative(5f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(5f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(7.69f, 16.479f)
                lineToRelative(1.29f, 4.88f)
                arcToRelative(.5f, .5f, 0f, false, true, -.698f, .591f)
                lineToRelative(-1.843f, -.849f)
                arcToRelative(1f, 1f, 0f, false, false, -.879f, .001f)
                lineToRelative(-1.846f, .85f)
                arcToRelative(.5f, .5f, 0f, false, true, -.692f, -.593f)
                lineToRelative(1.29f, -4.88f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f, 14.0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, 6.0f, 0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, -6.0f, 0f)
            }
}

public val LucideIcons.All.FileBadgeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FileBadge: ImageVector
    @Composable get() = FileBadgeDefinition.asImageVector()
