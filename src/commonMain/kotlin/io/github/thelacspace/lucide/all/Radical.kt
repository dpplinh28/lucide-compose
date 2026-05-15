package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Radical") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3f, 12f)
                horizontalLineToRelative(3.28f)
                arcToRelative(1f, 1f, 0f, false, true, .948f, .684f)
                lineToRelative(2.298f, 7.934f)
                arcToRelative(.5f, .5f, 0f, false, false, .96f, -.044f)
                lineTo(13.82f, 4.771f)
                arcTo(1f, 1f, 0f, false, true, 14.792f, 4f)
                horizontalLineTo(21f)
            }
}

public val LucideIcons.All.RadicalDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Radical: ImageVector
    @Composable get() = RadicalDefinition.asImageVector()
