package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Coins") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(13.744f, 17.736f)
                arcToRelative(6f, 6f, 0f, true, true, -7.48f, -7.48f)
            }
            lucidePath(strokeWidth) {
                moveTo(15f, 6f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(6.134f, 14.768f)
                lineToRelative(.866f, -.5f)
                lineToRelative(2f, 3.464f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f, 8.0f)
                arcToRelative(6.0f, 6.0f, 0f, true, false, 12.0f, 0f)
                arcToRelative(6.0f, 6.0f, 0f, true, false, -12.0f, 0f)
            }
}

public val LucideIcons.All.CoinsDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Coins: ImageVector
    @Composable get() = CoinsDefinition.asImageVector()
