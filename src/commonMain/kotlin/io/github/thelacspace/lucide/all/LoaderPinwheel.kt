package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("LoaderPinwheel") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(22f, 12f)
                arcToRelative(1f, 1f, 0f, false, true, -10f, 0f)
                arcToRelative(1f, 1f, 0f, false, false, -10f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7f, 20.7f)
                arcToRelative(1f, 1f, 0f, true, true, 5f, -8.7f)
                arcToRelative(1f, 1f, 0f, true, false, 5f, -8.6f)
            }
            lucidePath(strokeWidth) {
                moveTo(7f, 3.3f)
                arcToRelative(1f, 1f, 0f, true, true, 5f, 8.6f)
                arcToRelative(1f, 1f, 0f, true, false, 5f, 8.6f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f, 12.0f)
                arcToRelative(10.0f, 10.0f, 0f, true, false, 20.0f, 0f)
                arcToRelative(10.0f, 10.0f, 0f, true, false, -20.0f, 0f)
            }
}

public val LucideIcons.All.LoaderPinwheelDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.LoaderPinwheel: ImageVector
    @Composable get() = LoaderPinwheelDefinition.asImageVector()
