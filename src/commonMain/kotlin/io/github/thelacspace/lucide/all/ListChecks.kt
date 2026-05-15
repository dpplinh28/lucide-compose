package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ListChecks") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(13f, 5f)
                horizontalLineToRelative(8f)
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
                moveToRelative(3f, 17f)
                lineToRelative(2f, 2f)
                lineToRelative(4f, -4f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(3f, 7f)
                lineToRelative(2f, 2f)
                lineToRelative(4f, -4f)
            }
}

public val LucideIcons.All.ListChecksDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ListChecks: ImageVector
    @Composable get() = ListChecksDefinition.asImageVector()
