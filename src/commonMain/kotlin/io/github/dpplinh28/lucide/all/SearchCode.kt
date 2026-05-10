package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SearchCode") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(13f, 13.5f)
                lineToRelative(2f, -2.5f)
                lineToRelative(-2f, -2.5f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(21f, 21f)
                lineToRelative(-4.3f, -4.3f)
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 8.5f)
                lineTo(7f, 11f)
                lineToRelative(2f, 2.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f, 11.0f)
                arcToRelative(8.0f, 8.0f, 0f, true, false, 16.0f, 0f)
                arcToRelative(8.0f, 8.0f, 0f, true, false, -16.0f, 0f)
            }
}

public val LucideIcons.All.SearchCodeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SearchCode: ImageVector
    @Composable get() = SearchCodeDefinition.asImageVector()
