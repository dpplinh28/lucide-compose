package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ListChevronsDownUp") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3f, 5f)
                horizontalLineToRelative(8f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 12f)
                horizontalLineToRelative(8f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 19f)
                horizontalLineToRelative(8f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(15f, 5f)
                lineToRelative(3f, 3f)
                lineToRelative(3f, -3f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(15f, 19f)
                lineToRelative(3f, -3f)
                lineToRelative(3f, 3f)
            }
}

public val LucideIcons.All.ListChevronsDownUpDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ListChevronsDownUp: ImageVector
    @Composable get() = ListChevronsDownUpDefinition.asImageVector()
