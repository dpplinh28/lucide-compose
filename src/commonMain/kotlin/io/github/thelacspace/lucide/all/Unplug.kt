package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Unplug") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(19f, 5f)
                lineToRelative(3f, -3f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(2f, 22f)
                lineToRelative(3f, -3f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.3f, 20.3f)
                arcToRelative(2.4f, 2.4f, 0f, false, false, 3.4f, 0f)
                lineTo(12f, 18f)
                lineToRelative(-6f, -6f)
                lineToRelative(-2.3f, 2.3f)
                arcToRelative(2.4f, 2.4f, 0f, false, false, 0f, 3.4f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(7.5f, 13.5f)
                lineTo(10f, 11f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.5f, 16.5f)
                lineTo(13f, 14f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(12f, 6f)
                lineToRelative(6f, 6f)
                lineToRelative(2.3f, -2.3f)
                arcToRelative(2.4f, 2.4f, 0f, false, false, 0f, -3.4f)
                lineToRelative(-2.6f, -2.6f)
                arcToRelative(2.4f, 2.4f, 0f, false, false, -3.4f, 0f)
                close()
            }
}

public val LucideIcons.All.UnplugDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Unplug: ImageVector
    @Composable get() = UnplugDefinition.asImageVector()
