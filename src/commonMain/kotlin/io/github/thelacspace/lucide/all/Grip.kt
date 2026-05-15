package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Grip") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0f, true, false, 2.0f, 0f)
                arcToRelative(1.0f, 1.0f, 0f, true, false, -2.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0f, true, false, 2.0f, 0f)
                arcToRelative(1.0f, 1.0f, 0f, true, false, -2.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0f, true, false, 2.0f, 0f)
                arcToRelative(1.0f, 1.0f, 0f, true, false, -2.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(11.0f, 12.0f)
                arcToRelative(1.0f, 1.0f, 0f, true, false, 2.0f, 0f)
                arcToRelative(1.0f, 1.0f, 0f, true, false, -2.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f, 12.0f)
                arcToRelative(1.0f, 1.0f, 0f, true, false, 2.0f, 0f)
                arcToRelative(1.0f, 1.0f, 0f, true, false, -2.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f, 12.0f)
                arcToRelative(1.0f, 1.0f, 0f, true, false, 2.0f, 0f)
                arcToRelative(1.0f, 1.0f, 0f, true, false, -2.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(11.0f, 19.0f)
                arcToRelative(1.0f, 1.0f, 0f, true, false, 2.0f, 0f)
                arcToRelative(1.0f, 1.0f, 0f, true, false, -2.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f, 19.0f)
                arcToRelative(1.0f, 1.0f, 0f, true, false, 2.0f, 0f)
                arcToRelative(1.0f, 1.0f, 0f, true, false, -2.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f, 19.0f)
                arcToRelative(1.0f, 1.0f, 0f, true, false, 2.0f, 0f)
                arcToRelative(1.0f, 1.0f, 0f, true, false, -2.0f, 0f)
            }
}

public val LucideIcons.All.GripDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Grip: ImageVector
    @Composable get() = GripDefinition.asImageVector()
