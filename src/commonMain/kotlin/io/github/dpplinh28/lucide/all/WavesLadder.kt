package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("WavesLadder") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(19f, 5f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(11f)
            }
            lucidePath(strokeWidth) {
                moveTo(2f, 18f)
                curveToRelative(.6f, .5f, 1.2f, 1f, 2.5f, 1f)
                curveToRelative(2.5f, 0f, 2.5f, -2f, 5f, -2f)
                curveToRelative(2.6f, 0f, 2.4f, 2f, 5f, 2f)
                curveToRelative(2.5f, 0f, 2.5f, -2f, 5f, -2f)
                curveToRelative(1.3f, 0f, 1.9f, .5f, 2.5f, 1f)
            }
            lucidePath(strokeWidth) {
                moveTo(7f, 13f)
                horizontalLineToRelative(10f)
            }
            lucidePath(strokeWidth) {
                moveTo(7f, 9f)
                horizontalLineToRelative(10f)
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 5f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(11f)
            }
}

public val LucideIcons.All.WavesLadderDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.WavesLadder: ImageVector
    @Composable get() = WavesLadderDefinition.asImageVector()
