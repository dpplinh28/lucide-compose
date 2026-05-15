package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CircleDollarSign") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0f, 12.0f)
                arcToRelative(10.0f, 10.0f, 0f, true, false, 20.0f, 0f)
                arcToRelative(10.0f, 10.0f, 0f, true, false, -20.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 8f)
                horizontalLineToRelative(-6f)
                arcToRelative(2f, 2f, 0f, true, false, 0f, 4f)
                horizontalLineToRelative(4f)
                arcToRelative(2f, 2f, 0f, true, true, 0f, 4f)
                horizontalLineTo(8f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 18f)
                verticalLineTo(6f)
            }
}

public val LucideIcons.All.CircleDollarSignDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CircleDollarSign: ImageVector
    @Composable get() = CircleDollarSignDefinition.asImageVector()
