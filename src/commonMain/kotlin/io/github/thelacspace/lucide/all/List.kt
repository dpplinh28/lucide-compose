package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("List") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3f, 5f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 12f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 19f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 5f)
                horizontalLineToRelative(13f)
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 12f)
                horizontalLineToRelative(13f)
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 19f)
                horizontalLineToRelative(13f)
            }
}

public val LucideIcons.All.ListDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.List: ImageVector
    @Composable get() = ListDefinition.asImageVector()
