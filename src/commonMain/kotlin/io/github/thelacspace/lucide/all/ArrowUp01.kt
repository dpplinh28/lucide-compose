package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ArrowUp01") { strokeWidth ->
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
                moveTo(15.0f, 4.0f)
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
            lucidePath(strokeWidth) {
                moveTo(17f, 20f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-2f)
            }
            lucidePath(strokeWidth) {
                moveTo(15f, 20f)
                horizontalLineToRelative(4f)
            }
}

public val LucideIcons.All.ArrowUp01Definition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ArrowUp01: ImageVector
    @Composable get() = ArrowUp01Definition.asImageVector()
