package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("DollarSign") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 2f)
                lineTo(12f, 22f)
            }
            lucidePath(strokeWidth) {
                moveTo(17f, 5f)
                horizontalLineTo(9.5f)
                arcToRelative(3.5f, 3.5f, 0f, false, false, 0f, 7f)
                horizontalLineToRelative(5f)
                arcToRelative(3.5f, 3.5f, 0f, false, true, 0f, 7f)
                horizontalLineTo(6f)
            }
}

public val LucideIcons.All.DollarSignDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.DollarSign: ImageVector
    @Composable get() = DollarSignDefinition.asImageVector()
