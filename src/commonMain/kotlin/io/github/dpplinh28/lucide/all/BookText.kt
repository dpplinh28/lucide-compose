package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BookText") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4f, 19.5f)
                verticalLineToRelative(-15f)
                arcTo(2.5f, 2.5f, 0f, false, true, 6.5f, 2f)
                horizontalLineTo(19f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(18f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                horizontalLineTo(6.5f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, -5f)
                horizontalLineTo(20f)
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 11f)
                horizontalLineToRelative(8f)
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 7f)
                horizontalLineToRelative(6f)
            }
}

public val LucideIcons.All.BookTextDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BookText: ImageVector
    @Composable get() = BookTextDefinition.asImageVector()
