package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Ruler") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(21.3f, 15.3f)
                arcToRelative(2.4f, 2.4f, 0f, false, true, 0f, 3.4f)
                lineToRelative(-2.6f, 2.6f)
                arcToRelative(2.4f, 2.4f, 0f, false, true, -3.4f, 0f)
                lineTo(2.7f, 8.7f)
                arcToRelative(2.41f, 2.41f, 0f, false, true, 0f, -3.4f)
                lineToRelative(2.6f, -2.6f)
                arcToRelative(2.41f, 2.41f, 0f, false, true, 3.4f, 0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveToRelative(14.5f, 12.5f)
                lineToRelative(2f, -2f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(11.5f, 9.5f)
                lineToRelative(2f, -2f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(8.5f, 6.5f)
                lineToRelative(2f, -2f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(17.5f, 15.5f)
                lineToRelative(2f, -2f)
            }
}

public val LucideIcons.All.RulerDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Ruler: ImageVector
    @Composable get() = RulerDefinition.asImageVector()
