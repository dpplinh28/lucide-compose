package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Bomb") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0f, 13.0f)
                arcToRelative(9.0f, 9.0f, 0f, true, false, 18.0f, 0f)
                arcToRelative(9.0f, 9.0f, 0f, true, false, -18.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.35f, 4.65f)
                lineTo(16.3f, 2.7f)
                arcToRelative(2.41f, 2.41f, 0f, false, true, 3.4f, 0f)
                lineToRelative(1.6f, 1.6f)
                arcToRelative(2.4f, 2.4f, 0f, false, true, 0f, 3.4f)
                lineToRelative(-1.95f, 1.95f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(22f, 2f)
                lineToRelative(-1.5f, 1.5f)
            }
}

public val LucideIcons.All.BombDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Bomb: ImageVector
    @Composable get() = BombDefinition.asImageVector()
