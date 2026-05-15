package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Wind") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.8f, 19.6f)
                arcTo(2f, 2f, 0f, true, false, 14f, 16f)
                horizontalLineTo(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.5f, 8f)
                arcToRelative(2.5f, 2.5f, 0f, true, true, 2f, 4f)
                horizontalLineTo(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.8f, 4.4f)
                arcTo(2f, 2f, 0f, true, true, 11f, 8f)
                horizontalLineTo(2f)
            }
}

public val LucideIcons.All.WindDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Wind: ImageVector
    @Composable get() = WindDefinition.asImageVector()
