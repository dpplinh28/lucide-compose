package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Component") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.536f, 11.293f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, 1.414f)
                lineToRelative(2.376f, 2.377f)
                arcToRelative(1f, 1f, 0f, false, false, 1.414f, 0f)
                lineToRelative(2.377f, -2.377f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -1.414f)
                lineToRelative(-2.377f, -2.377f)
                arcToRelative(1f, 1f, 0f, false, false, -1.414f, 0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(2.297f, 11.293f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, 1.414f)
                lineToRelative(2.377f, 2.377f)
                arcToRelative(1f, 1f, 0f, false, false, 1.414f, 0f)
                lineToRelative(2.377f, -2.377f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -1.414f)
                lineTo(6.088f, 8.916f)
                arcToRelative(1f, 1f, 0f, false, false, -1.414f, 0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(8.916f, 17.912f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, 1.415f)
                lineToRelative(2.377f, 2.376f)
                arcToRelative(1f, 1f, 0f, false, false, 1.414f, 0f)
                lineToRelative(2.377f, -2.376f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -1.415f)
                lineToRelative(-2.377f, -2.376f)
                arcToRelative(1f, 1f, 0f, false, false, -1.414f, 0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(8.916f, 4.674f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, 1.414f)
                lineToRelative(2.377f, 2.376f)
                arcToRelative(1f, 1f, 0f, false, false, 1.414f, 0f)
                lineToRelative(2.377f, -2.376f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -1.414f)
                lineToRelative(-2.377f, -2.377f)
                arcToRelative(1f, 1f, 0f, false, false, -1.414f, 0f)
                close()
            }
}

public val LucideIcons.All.ComponentDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Component: ImageVector
    @Composable get() = ComponentDefinition.asImageVector()
