package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("RemoveFormatting") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4f, 7f)
                verticalLineTo(4f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(3f)
            }
            lucidePath(strokeWidth) {
                moveTo(5f, 20f)
                horizontalLineToRelative(6f)
            }
            lucidePath(strokeWidth) {
                moveTo(13f, 4f)
                lineTo(8f, 20f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(15f, 15f)
                lineToRelative(5f, 5f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(20f, 15f)
                lineToRelative(-5f, 5f)
            }
}

public val LucideIcons.All.RemoveFormattingDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.RemoveFormatting: ImageVector
    @Composable get() = RemoveFormattingDefinition.asImageVector()
