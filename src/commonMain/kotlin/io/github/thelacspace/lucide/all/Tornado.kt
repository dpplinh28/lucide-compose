package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Tornado") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(21f, 4f)
                horizontalLineTo(3f)
            }
            lucidePath(strokeWidth) {
                moveTo(18f, 8f)
                horizontalLineTo(6f)
            }
            lucidePath(strokeWidth) {
                moveTo(19f, 12f)
                horizontalLineTo(9f)
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 16f)
                horizontalLineToRelative(-6f)
            }
            lucidePath(strokeWidth) {
                moveTo(11f, 20f)
                horizontalLineTo(9f)
            }
}

public val LucideIcons.All.TornadoDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Tornado: ImageVector
    @Composable get() = TornadoDefinition.asImageVector()
