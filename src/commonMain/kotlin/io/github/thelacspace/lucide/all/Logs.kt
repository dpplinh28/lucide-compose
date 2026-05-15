package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Logs") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3f, 5f)
                horizontalLineToRelative(1f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 12f)
                horizontalLineToRelative(1f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 19f)
                horizontalLineToRelative(1f)
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 5f)
                horizontalLineToRelative(1f)
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 12f)
                horizontalLineToRelative(1f)
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 19f)
                horizontalLineToRelative(1f)
            }
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
}

public val LucideIcons.All.LogsDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Logs: ImageVector
    @Composable get() = LogsDefinition.asImageVector()
