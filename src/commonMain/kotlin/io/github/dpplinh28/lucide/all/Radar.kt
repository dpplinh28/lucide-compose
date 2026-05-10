package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Radar") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(19.07f, 4.93f)
                arcTo(10f, 10f, 0f, false, false, 6.99f, 3.34f)
            }
            lucidePath(strokeWidth) {
                moveTo(4f, 6f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.29f, 9.62f)
                arcTo(10f, 10f, 0f, true, false, 21.31f, 8.35f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.24f, 7.76f)
                arcTo(6f, 6f, 0f, true, false, 8.23f, 16.67f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 18f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.99f, 11.66f)
                arcTo(6f, 6f, 0f, false, true, 15.77f, 16.67f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f, 12.0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, 4.0f, 0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, -4.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(13.41f, 10.59f)
                lineToRelative(5.66f, -5.66f)
            }
}

public val LucideIcons.All.RadarDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Radar: ImageVector
    @Composable get() = RadarDefinition.asImageVector()
