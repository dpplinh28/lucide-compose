package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Aperture") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0f, 12.0f)
                arcToRelative(10.0f, 10.0f, 0f, true, false, 20.0f, 0f)
                arcToRelative(10.0f, 10.0f, 0f, true, false, -20.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(14.31f, 8f)
                lineToRelative(5.74f, 9.94f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.69f, 8f)
                horizontalLineToRelative(11.48f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(7.38f, 12f)
                lineToRelative(5.74f, -9.94f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.69f, 16f)
                lineTo(3.95f, 6.06f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.31f, 16f)
                horizontalLineTo(2.83f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(16.62f, 12f)
                lineToRelative(-5.74f, 9.94f)
            }
}

public val LucideIcons.All.ApertureDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Aperture: ImageVector
    @Composable get() = ApertureDefinition.asImageVector()
