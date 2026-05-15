package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Sunset") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 10f)
                verticalLineTo(2f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(4.93f, 10.93f)
                lineToRelative(1.41f, 1.41f)
            }
            lucidePath(strokeWidth) {
                moveTo(2f, 18f)
                horizontalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(20f, 18f)
                horizontalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(19.07f, 10.93f)
                lineToRelative(-1.41f, 1.41f)
            }
            lucidePath(strokeWidth) {
                moveTo(22f, 22f)
                horizontalLineTo(2f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(16f, 6f)
                lineToRelative(-4f, 4f)
                lineToRelative(-4f, -4f)
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 18f)
                arcToRelative(4f, 4f, 0f, false, false, -8f, 0f)
            }
}

public val LucideIcons.All.SunsetDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Sunset: ImageVector
    @Composable get() = SunsetDefinition.asImageVector()
