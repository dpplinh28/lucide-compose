package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("HandMetal") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(18f, 12.5f)
                verticalLineTo(10f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(1.4f)
            }
            lucidePath(strokeWidth) {
                moveTo(14f, 11f)
                verticalLineTo(9f)
                arcToRelative(2f, 2f, 0f, true, false, -4f, 0f)
                verticalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(10f, 10.5f)
                verticalLineTo(5f)
                arcToRelative(2f, 2f, 0f, true, false, -4f, 0f)
                verticalLineToRelative(9f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(7f, 15f)
                lineToRelative(-1.76f, -1.76f)
                arcToRelative(2f, 2f, 0f, false, false, -2.83f, 2.82f)
                lineToRelative(3.6f, 3.6f)
                curveTo(7.5f, 21.14f, 9.2f, 22f, 12f, 22f)
                horizontalLineToRelative(2f)
                arcToRelative(8f, 8f, 0f, false, false, 8f, -8f)
                verticalLineTo(7f)
                arcToRelative(2f, 2f, 0f, true, false, -4f, 0f)
                verticalLineToRelative(5f)
            }
}

public val LucideIcons.All.HandMetalDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.HandMetal: ImageVector
    @Composable get() = HandMetalDefinition.asImageVector()
