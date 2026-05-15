package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ArrowLeftRight") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(8f, 3f)
                lineTo(4f, 7f)
                lineToRelative(4f, 4f)
            }
            lucidePath(strokeWidth) {
                moveTo(4f, 7f)
                horizontalLineToRelative(16f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(16f, 21f)
                lineToRelative(4f, -4f)
                lineToRelative(-4f, -4f)
            }
            lucidePath(strokeWidth) {
                moveTo(20f, 17f)
                horizontalLineTo(4f)
            }
}

public val LucideIcons.All.ArrowLeftRightDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ArrowLeftRight: ImageVector
    @Composable get() = ArrowLeftRightDefinition.asImageVector()
