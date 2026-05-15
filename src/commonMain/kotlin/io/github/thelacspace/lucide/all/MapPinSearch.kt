package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MapPinSearch") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.248f, 21.969f)
                arcToRelative(1f, 1f, 0f, false, true, -0.849f, -0.17f)
                curveTo(9.539f, 20.193f, 4f, 14.993f, 4f, 10f)
                arcToRelative(8f, 8f, 0f, false, true, 16f, 0f)
                curveTo(20f, 10.42f, 19.961f, 10.841f, 19.888f, 11.262f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(22f, 22f)
                lineToRelative(-1.88f, -1.88f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f, 10.0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, 6.0f, 0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, -6.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f, 18.0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, 6.0f, 0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, -6.0f, 0f)
            }
}

public val LucideIcons.All.MapPinSearchDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MapPinSearch: ImageVector
    @Composable get() = MapPinSearchDefinition.asImageVector()
