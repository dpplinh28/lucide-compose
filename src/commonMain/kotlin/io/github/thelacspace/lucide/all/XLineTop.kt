package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("XLineTop") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(18f, 4f)
                horizontalLineTo(6f)
            }
            lucidePath(strokeWidth) {
                moveTo(18f, 8f)
                lineTo(6f, 20f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(6f, 8f)
                lineToRelative(12f, 12f)
            }
}

public val LucideIcons.All.XLineTopDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.XLineTop: ImageVector
    @Composable get() = XLineTopDefinition.asImageVector()
