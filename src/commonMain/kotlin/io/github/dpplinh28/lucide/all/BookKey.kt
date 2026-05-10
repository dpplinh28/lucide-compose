package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BookKey") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(13f, 2f)
                horizontalLineTo(6.5f)
                arcTo(2.5f, 2.5f, 0f, false, false, 4f, 4.5f)
                verticalLineToRelative(15f)
            }
            lucidePath(strokeWidth) {
                moveTo(17f, 2f)
                verticalLineToRelative(6f)
            }
            lucidePath(strokeWidth) {
                moveTo(17f, 4f)
                horizontalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(20f, 15.2f)
                verticalLineTo(21f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                horizontalLineTo(6.5f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, -5f)
                horizontalLineTo(20f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f, 10.0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, 4.0f, 0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, -4.0f, 0f)
            }
}

public val LucideIcons.All.BookKeyDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BookKey: ImageVector
    @Composable get() = BookKeyDefinition.asImageVector()
