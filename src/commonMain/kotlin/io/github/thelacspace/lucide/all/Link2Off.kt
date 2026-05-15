package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Link2Off") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(9f, 17f)
                horizontalLineTo(7f)
                arcTo(5f, 5f, 0f, false, true, 7f, 7f)
            }
            lucidePath(strokeWidth) {
                moveTo(15f, 7f)
                horizontalLineToRelative(2f)
                arcToRelative(5f, 5f, 0f, false, true, 4f, 8f)
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 12f)
                lineTo(12f, 12f)
            }
            lucidePath(strokeWidth) {
                moveTo(2f, 2f)
                lineTo(22f, 22f)
            }
}

public val LucideIcons.All.Link2OffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Link2Off: ImageVector
    @Composable get() = Link2OffDefinition.asImageVector()
