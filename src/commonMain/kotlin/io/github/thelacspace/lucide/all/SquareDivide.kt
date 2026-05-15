package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SquareDivide") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(5.0f, 3.0f)
                horizontalLineToRelative(14.0f)
                arcToRelative(2.0f, 2.0f, 0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(14.0f)
                arcToRelative(2.0f, 2.0f, 0f, false, true, -2.0f, 2.0f)
                horizontalLineToRelative(-14.0f)
                arcToRelative(2.0f, 2.0f, 0f, false, true, -2.0f, -2.0f)
                verticalLineToRelative(-14.0f)
                arcToRelative(2.0f, 2.0f, 0f, false, true, 2.0f, -2.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 12f)
                lineTo(16f, 12f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 16f)
                lineTo(12f, 16f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 8f)
                lineTo(12f, 8f)
            }
}

public val LucideIcons.All.SquareDivideDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SquareDivide: ImageVector
    @Composable get() = SquareDivideDefinition.asImageVector()
