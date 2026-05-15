package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Percent") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(19f, 5f)
                lineTo(5f, 19f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f, 6.5f)
                arcToRelative(2.5f, 2.5f, 0f, true, false, 5.0f, 0f)
                arcToRelative(2.5f, 2.5f, 0f, true, false, -5.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f, 17.5f)
                arcToRelative(2.5f, 2.5f, 0f, true, false, 5.0f, 0f)
                arcToRelative(2.5f, 2.5f, 0f, true, false, -5.0f, 0f)
            }
}

public val LucideIcons.All.PercentDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Percent: ImageVector
    @Composable get() = PercentDefinition.asImageVector()
