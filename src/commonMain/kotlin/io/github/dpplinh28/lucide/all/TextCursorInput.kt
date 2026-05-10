package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("TextCursorInput") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 20f)
                horizontalLineToRelative(-1f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineTo(6f)
            }
            lucidePath(strokeWidth) {
                moveTo(13f, 8f)
                horizontalLineToRelative(7f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(4f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineToRelative(-7f)
            }
            lucidePath(strokeWidth) {
                moveTo(5f, 16f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineToRelative(-4f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(1f)
            }
            lucidePath(strokeWidth) {
                moveTo(6f, 4f)
                horizontalLineToRelative(1f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(1f)
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 6f)
                verticalLineToRelative(12f)
            }
}

public val LucideIcons.All.TextCursorInputDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.TextCursorInput: ImageVector
    @Composable get() = TextCursorInputDefinition.asImageVector()
