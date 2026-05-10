package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BookPlus") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 7f)
                verticalLineToRelative(6f)
            }
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
                moveTo(9f, 10f)
                horizontalLineToRelative(6f)
            }
}

public val LucideIcons.All.BookPlusDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BookPlus: ImageVector
    @Composable get() = BookPlusDefinition.asImageVector()
