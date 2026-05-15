package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Hamburger") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 16f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, true, true, 0f, -4f)
                horizontalLineToRelative(16f)
                arcToRelative(2f, 2f, 0f, true, true, 0f, 4f)
                horizontalLineToRelative(-4.25f)
            }
            lucidePath(strokeWidth) {
                moveTo(5f, 12f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                arcToRelative(9f, 7f, 0f, false, true, 18f, 0f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
            }
            lucidePath(strokeWidth) {
                moveTo(5f, 16f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                arcToRelative(3f, 3f, 0f, false, false, 3f, 3f)
                horizontalLineToRelative(12f)
                arcToRelative(3f, 3f, 0f, false, false, 3f, -3f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                quadToRelative(0f, 0f, 0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(6.67f, 12f)
                lineToRelative(6.13f, 4.6f)
                arcToRelative(2f, 2f, 0f, false, false, 2.8f, -.4f)
                lineToRelative(3.15f, -4.2f)
            }
}

public val LucideIcons.All.HamburgerDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Hamburger: ImageVector
    @Composable get() = HamburgerDefinition.asImageVector()
