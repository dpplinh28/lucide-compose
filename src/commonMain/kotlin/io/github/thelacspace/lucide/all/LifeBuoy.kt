package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("LifeBuoy") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0f, 12.0f)
                arcToRelative(10.0f, 10.0f, 0f, true, false, 20.0f, 0f)
                arcToRelative(10.0f, 10.0f, 0f, true, false, -20.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(4.93f, 4.93f)
                lineToRelative(4.24f, 4.24f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(14.83f, 9.17f)
                lineToRelative(4.24f, -4.24f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(14.83f, 14.83f)
                lineToRelative(4.24f, 4.24f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(9.17f, 14.83f)
                lineToRelative(-4.24f, 4.24f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f, 12.0f)
                arcToRelative(4.0f, 4.0f, 0f, true, false, 8.0f, 0f)
                arcToRelative(4.0f, 4.0f, 0f, true, false, -8.0f, 0f)
            }
}

public val LucideIcons.All.LifeBuoyDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.LifeBuoy: ImageVector
    @Composable get() = LifeBuoyDefinition.asImageVector()
