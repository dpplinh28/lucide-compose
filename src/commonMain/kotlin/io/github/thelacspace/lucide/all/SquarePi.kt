package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SquarePi") { strokeWidth ->
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
                moveTo(7f, 7f)
                horizontalLineToRelative(10f)
            }
            lucidePath(strokeWidth) {
                moveTo(10f, 7f)
                verticalLineToRelative(10f)
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 17f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineTo(7f)
            }
}

public val LucideIcons.All.SquarePiDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SquarePi: ImageVector
    @Composable get() = SquarePiDefinition.asImageVector()
