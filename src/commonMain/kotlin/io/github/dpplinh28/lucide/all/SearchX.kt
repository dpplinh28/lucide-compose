package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SearchX") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(13.5f, 8.5f)
                lineToRelative(-5f, 5f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(8.5f, 8.5f)
                lineToRelative(5f, 5f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f, 11.0f)
                arcToRelative(8.0f, 8.0f, 0f, true, false, 16.0f, 0f)
                arcToRelative(8.0f, 8.0f, 0f, true, false, -16.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(21f, 21f)
                lineToRelative(-4.3f, -4.3f)
            }
}

public val LucideIcons.All.SearchXDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SearchX: ImageVector
    @Composable get() = SearchXDefinition.asImageVector()
