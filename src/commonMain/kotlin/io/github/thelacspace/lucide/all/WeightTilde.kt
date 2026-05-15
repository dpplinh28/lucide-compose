package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("WeightTilde") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(6.5f, 8f)
                arcToRelative(2f, 2f, 0f, false, false, -1.906f, 1.46f)
                lineTo(2.1f, 18.5f)
                arcTo(2f, 2f, 0f, false, false, 4f, 21f)
                horizontalLineToRelative(16f)
                arcToRelative(2f, 2f, 0f, false, false, 1.925f, -2.54f)
                lineTo(19.4f, 9.5f)
                arcTo(2f, 2f, 0f, false, false, 17.48f, 8f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(7.999f, 15f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, 4f, 0f)
                arcToRelative(2.5f, 2.5f, 0f, false, false, 4f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f, 5.0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, 6.0f, 0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, -6.0f, 0f)
            }
}

public val LucideIcons.All.WeightTildeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.WeightTilde: ImageVector
    @Composable get() = WeightTildeDefinition.asImageVector()
