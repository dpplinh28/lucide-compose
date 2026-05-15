package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MoveRight") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(18f, 8f)
                lineTo(22f, 12f)
                lineTo(18f, 16f)
            }
            lucidePath(strokeWidth) {
                moveTo(2f, 12f)
                horizontalLineTo(22f)
            }
}

public val LucideIcons.All.MoveRightDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MoveRight: ImageVector
    @Composable get() = MoveRightDefinition.asImageVector()
