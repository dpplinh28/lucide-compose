package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SquarePilcrow") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(5.0f, 3.0f)
                horizontalLineToRelative(14.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, 2.0f, 0.0f)
                verticalLineToRelative(18.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, -2.0f, 0.0f)
                horizontalLineToRelative(-14.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, -2.0f, -0.0f)
                verticalLineToRelative(-18.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, 2.0f, -0.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 12f)
                horizontalLineTo(9.5f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, 0f, -5f)
                horizontalLineTo(17f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 7f)
                verticalLineToRelative(10f)
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 7f)
                verticalLineToRelative(10f)
            }
}

public val LucideIcons.All.SquarePilcrowDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SquarePilcrow: ImageVector
    @Composable get() = SquarePilcrowDefinition.asImageVector()
