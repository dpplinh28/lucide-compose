package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Guitar") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(11.9f, 12.1f)
                lineToRelative(4.514f, -4.514f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.1f, 2.3f)
                arcToRelative(1f, 1f, 0f, false, false, -1.4f, 0f)
                lineToRelative(-1.114f, 1.114f)
                arcTo(2f, 2f, 0f, false, false, 17f, 4.828f)
                verticalLineToRelative(1.344f)
                arcToRelative(2f, 2f, 0f, false, true, -.586f, 1.414f)
                arcTo(2f, 2f, 0f, false, true, 17.828f, 7f)
                horizontalLineToRelative(1.344f)
                arcToRelative(2f, 2f, 0f, false, false, 1.414f, -.586f)
                lineTo(21.7f, 5.3f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -1.4f)
                close()
            }
            lucidePath(strokeWidth) {
                moveToRelative(6f, 16f)
                lineToRelative(2f, 2f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.23f, 9.85f)
                arcTo(3f, 3f, 0f, false, true, 11f, 8f)
                arcToRelative(5f, 5f, 0f, false, true, 5f, 5f)
                arcToRelative(3f, 3f, 0f, false, true, -1.85f, 2.77f)
                lineToRelative(-.92f, .38f)
                arcTo(2f, 2f, 0f, false, false, 12f, 18f)
                arcToRelative(4f, 4f, 0f, false, true, -4f, 4f)
                arcToRelative(6f, 6f, 0f, false, true, -6f, -6f)
                arcToRelative(4f, 4f, 0f, false, true, 4f, -4f)
                arcToRelative(2f, 2f, 0f, false, false, 1.85f, -1.23f)
                close()
            }
}

public val LucideIcons.All.GuitarDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Guitar: ImageVector
    @Composable get() = GuitarDefinition.asImageVector()
