package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Ligature") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14f, 12f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(8f)
            }
            lucidePath(strokeWidth) {
                moveTo(14f, 20f)
                horizontalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(6f, 12f)
                horizontalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(6f, 20f)
                horizontalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 20f)
                verticalLineTo(8f)
                arcToRelative(4f, 4f, 0f, false, true, 7.464f, -2f)
            }
}

public val LucideIcons.All.LigatureDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Ligature: ImageVector
    @Composable get() = LigatureDefinition.asImageVector()
