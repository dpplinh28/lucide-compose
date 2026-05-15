package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Wheat") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2f, 22f)
                lineTo(16f, 8f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.47f, 12.53f)
                lineTo(5f, 11f)
                lineToRelative(1.53f, 1.53f)
                arcToRelative(3.5f, 3.5f, 0f, false, true, 0f, 4.94f)
                lineTo(5f, 19f)
                lineToRelative(-1.53f, -1.53f)
                arcToRelative(3.5f, 3.5f, 0f, false, true, 0f, -4.94f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(7.47f, 8.53f)
                lineTo(9f, 7f)
                lineToRelative(1.53f, 1.53f)
                arcToRelative(3.5f, 3.5f, 0f, false, true, 0f, 4.94f)
                lineTo(9f, 15f)
                lineToRelative(-1.53f, -1.53f)
                arcToRelative(3.5f, 3.5f, 0f, false, true, 0f, -4.94f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(11.47f, 4.53f)
                lineTo(13f, 3f)
                lineToRelative(1.53f, 1.53f)
                arcToRelative(3.5f, 3.5f, 0f, false, true, 0f, 4.94f)
                lineTo(13f, 11f)
                lineToRelative(-1.53f, -1.53f)
                arcToRelative(3.5f, 3.5f, 0f, false, true, 0f, -4.94f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(20f, 2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                arcToRelative(4f, 4f, 0f, false, true, -4f, 4f)
                horizontalLineToRelative(-2f)
                verticalLineTo(6f)
                arcToRelative(4f, 4f, 0f, false, true, 4f, -4f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(11.47f, 17.47f)
                lineTo(13f, 19f)
                lineToRelative(-1.53f, 1.53f)
                arcToRelative(3.5f, 3.5f, 0f, false, true, -4.94f, 0f)
                lineTo(5f, 19f)
                lineToRelative(1.53f, -1.53f)
                arcToRelative(3.5f, 3.5f, 0f, false, true, 4.94f, 0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(15.47f, 13.47f)
                lineTo(17f, 15f)
                lineToRelative(-1.53f, 1.53f)
                arcToRelative(3.5f, 3.5f, 0f, false, true, -4.94f, 0f)
                lineTo(9f, 15f)
                lineToRelative(1.53f, -1.53f)
                arcToRelative(3.5f, 3.5f, 0f, false, true, 4.94f, 0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(19.47f, 9.47f)
                lineTo(21f, 11f)
                lineToRelative(-1.53f, 1.53f)
                arcToRelative(3.5f, 3.5f, 0f, false, true, -4.94f, 0f)
                lineTo(13f, 11f)
                lineToRelative(1.53f, -1.53f)
                arcToRelative(3.5f, 3.5f, 0f, false, true, 4.94f, 0f)
                close()
            }
}

public val LucideIcons.All.WheatDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Wheat: ImageVector
    @Composable get() = WheatDefinition.asImageVector()
