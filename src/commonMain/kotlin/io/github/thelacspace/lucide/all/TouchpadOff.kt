package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("TouchpadOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 20f)
                verticalLineToRelative(-6f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.656f, 14f)
                horizontalLineTo(22f)
            }
            lucidePath(strokeWidth) {
                moveTo(2f, 14f)
                horizontalLineToRelative(12f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(2f, 2f)
                lineToRelative(20f, 20f)
            }
            lucidePath(strokeWidth) {
                moveTo(20f, 20f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineTo(6f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.656f, 4f)
                horizontalLineTo(20f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(10.344f)
            }
}

public val LucideIcons.All.TouchpadOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.TouchpadOff: ImageVector
    @Composable get() = TouchpadOffDefinition.asImageVector()
