package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Radius") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(20.34f, 17.52f)
                arcToRelative(10f, 10f, 0f, true, false, -2.82f, 2.82f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0f, 19.0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, 4.0f, 0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, -4.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(13.41f, 13.41f)
                lineToRelative(4.18f, 4.18f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f, 12.0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, 4.0f, 0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, -4.0f, 0f)
            }
}

public val LucideIcons.All.RadiusDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Radius: ImageVector
    @Composable get() = RadiusDefinition.asImageVector()
