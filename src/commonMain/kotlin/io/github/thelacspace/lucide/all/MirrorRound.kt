package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MirrorRound") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10f, 6.6f)
                lineTo(8.6f, 8f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 18f)
                verticalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(15f, 7.5f)
                lineTo(9.5f, 13f)
            }
            lucidePath(strokeWidth) {
                moveTo(7f, 22f)
                horizontalLineToRelative(10f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f, 10.0f)
                arcToRelative(8.0f, 8.0f, 0f, true, false, 16.0f, 0f)
                arcToRelative(8.0f, 8.0f, 0f, true, false, -16.0f, 0f)
            }
}

public val LucideIcons.All.MirrorRoundDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MirrorRound: ImageVector
    @Composable get() = MirrorRoundDefinition.asImageVector()
