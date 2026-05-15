package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ListChevronsUpDown") { strokeWidth ->
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
                moveToRelative(15f, 8f)
                lineToRelative(3f, -3f)
                lineToRelative(3f, 3f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(15f, 16f)
                lineToRelative(3f, 3f)
                lineToRelative(3f, -3f)
            }
}

public val LucideIcons.All.ListChevronsUpDownDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ListChevronsUpDown: ImageVector
    @Composable get() = ListChevronsUpDownDefinition.asImageVector()
