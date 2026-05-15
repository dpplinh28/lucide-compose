package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Film") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(5.0f, 3.0f)
                horizontalLineToRelative(14.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, 2.0f, 0.0f)
                verticalLineToRelative(18.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, -2.0f, 0.0f)
                horizontalLineToRelative(-14.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, -2.0f, -0.0f)
                verticalLineToRelative(-18.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, 2.0f, -0.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(7f, 3f)
                verticalLineToRelative(18f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 7.5f)
                horizontalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 12f)
                horizontalLineToRelative(18f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 16.5f)
                horizontalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(17f, 3f)
                verticalLineToRelative(18f)
            }
            lucidePath(strokeWidth) {
                moveTo(17f, 7.5f)
                horizontalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(17f, 16.5f)
                horizontalLineToRelative(4f)
            }
}

public val LucideIcons.All.FilmDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Film: ImageVector
    @Composable get() = FilmDefinition.asImageVector()
