package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ListTree") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(8f, 5f)
                horizontalLineToRelative(13f)
            }
            lucidePath(strokeWidth) {
                moveTo(13f, 12f)
                horizontalLineToRelative(8f)
            }
            lucidePath(strokeWidth) {
                moveTo(13f, 19f)
                horizontalLineToRelative(8f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 10f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(3f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 5f)
                verticalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(3f)
            }
}

public val LucideIcons.All.ListTreeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ListTree: ImageVector
    @Composable get() = ListTreeDefinition.asImageVector()
