package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("History") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3f, 12f)
                arcToRelative(9f, 9f, 0f, true, false, 9f, -9f)
                arcToRelative(9.75f, 9.75f, 0f, false, false, -6.74f, 2.74f)
                lineTo(3f, 8f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 3f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(5f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 7f)
                verticalLineToRelative(5f)
                lineToRelative(4f, 2f)
            }
}

public val LucideIcons.All.HistoryDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.History: ImageVector
    @Composable get() = HistoryDefinition.asImageVector()
