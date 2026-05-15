package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MousePointerClick") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14f, 4.1f)
                lineTo(12f, 6f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(5.1f, 8f)
                lineToRelative(-2.9f, -.8f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(6f, 12f)
                lineToRelative(-1.9f, 2f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.2f, 2.2f)
                lineTo(8f, 5.1f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.037f, 9.69f)
                arcToRelative(.498f, .498f, 0f, false, true, .653f, -.653f)
                lineToRelative(11f, 4.5f)
                arcToRelative(.5f, .5f, 0f, false, true, -.074f, .949f)
                lineToRelative(-4.349f, 1.041f)
                arcToRelative(1f, 1f, 0f, false, false, -.74f, .739f)
                lineToRelative(-1.04f, 4.35f)
                arcToRelative(.5f, .5f, 0f, false, true, -.95f, .074f)
                close()
            }
}

public val LucideIcons.All.MousePointerClickDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MousePointerClick: ImageVector
    @Composable get() = MousePointerClickDefinition.asImageVector()
