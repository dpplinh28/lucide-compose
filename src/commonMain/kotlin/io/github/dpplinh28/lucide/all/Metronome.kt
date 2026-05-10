package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Metronome") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 11.4f)
                verticalLineTo(9.1f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(12f, 17f)
                lineToRelative(6.59f, -6.59f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(15.05f, 5.7f)
                lineToRelative(-.218f, -.691f)
                arcToRelative(3f, 3f, 0f, false, false, -5.663f, 0f)
                lineTo(4.418f, 19.695f)
                arcTo(1f, 1f, 0f, false, false, 5.37f, 21f)
                horizontalLineToRelative(13.253f)
                arcToRelative(1f, 1f, 0f, false, false, .951f, -1.31f)
                lineTo(18.45f, 16.2f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f, 9.0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, 4.0f, 0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, -4.0f, 0f)
            }
}

public val LucideIcons.All.MetronomeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Metronome: ImageVector
    @Composable get() = MetronomeDefinition.asImageVector()
