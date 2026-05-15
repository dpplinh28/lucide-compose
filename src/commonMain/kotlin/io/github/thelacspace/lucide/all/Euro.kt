package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Euro") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4f, 10f)
                horizontalLineToRelative(12f)
            }
            lucidePath(strokeWidth) {
                moveTo(4f, 14f)
                horizontalLineToRelative(9f)
            }
            lucidePath(strokeWidth) {
                moveTo(19f, 6f)
                arcToRelative(7.7f, 7.7f, 0f, false, false, -5.2f, -2f)
                arcTo(7.9f, 7.9f, 0f, false, false, 6f, 12f)
                curveToRelative(0f, 4.4f, 3.5f, 8f, 7.8f, 8f)
                curveToRelative(2f, 0f, 3.8f, -.8f, 5.2f, -2f)
            }
}

public val LucideIcons.All.EuroDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Euro: ImageVector
    @Composable get() = EuroDefinition.asImageVector()
