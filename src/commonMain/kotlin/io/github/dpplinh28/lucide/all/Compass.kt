package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Compass") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0f, 12.0f)
                arcToRelative(10.0f, 10.0f, 0f, true, false, 20.0f, 0f)
                arcToRelative(10.0f, 10.0f, 0f, true, false, -20.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(16.24f, 7.76f)
                lineToRelative(-1.804f, 5.411f)
                arcToRelative(2f, 2f, 0f, false, true, -1.265f, 1.265f)
                lineTo(7.76f, 16.24f)
                lineToRelative(1.804f, -5.411f)
                arcToRelative(2f, 2f, 0f, false, true, 1.265f, -1.265f)
                close()
            }
}

public val LucideIcons.All.CompassDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Compass: ImageVector
    @Composable get() = CompassDefinition.asImageVector()
