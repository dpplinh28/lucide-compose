package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ArrowUp10") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(3f, 8f)
                lineToRelative(4f, -4f)
                lineToRelative(4f, 4f)
            }
            lucidePath(strokeWidth) {
                moveTo(7f, 4f)
                verticalLineToRelative(16f)
            }
            lucidePath(strokeWidth) {
                moveTo(17f, 10f)
                verticalLineTo(4f)
                horizontalLineToRelative(-2f)
            }
            lucidePath(strokeWidth) {
                moveTo(15f, 10f)
                horizontalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f, 14.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(0.0f, 2.0f, 0f, false, true, 0.0f, 2.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(0.0f, 2.0f, 0f, false, true, -0.0f, 2.0f)
                horizontalLineToRelative(-4.0f)
                arcToRelative(0.0f, 2.0f, 0f, false, true, -0.0f, -2.0f)
                verticalLineToRelative(-2.0f)
                arcToRelative(0.0f, 2.0f, 0f, false, true, 0.0f, -2.0f)
                close()
            }
}

public val LucideIcons.All.ArrowUp10Definition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ArrowUp10: ImageVector
    @Composable get() = ArrowUp10Definition.asImageVector()
