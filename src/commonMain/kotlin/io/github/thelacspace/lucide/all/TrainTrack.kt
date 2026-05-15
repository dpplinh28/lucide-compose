package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("TrainTrack") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2f, 17f)
                lineTo(17f, 2f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(2f, 14f)
                lineToRelative(8f, 8f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(5f, 11f)
                lineToRelative(8f, 8f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(8f, 8f)
                lineToRelative(8f, 8f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(11f, 5f)
                lineToRelative(8f, 8f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(14f, 2f)
                lineToRelative(8f, 8f)
            }
            lucidePath(strokeWidth) {
                moveTo(7f, 22f)
                lineTo(22f, 7f)
            }
}

public val LucideIcons.All.TrainTrackDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.TrainTrack: ImageVector
    @Composable get() = TrainTrackDefinition.asImageVector()
