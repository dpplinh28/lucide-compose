package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ALargeSmall") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(15f, 16f)
                lineToRelative(2.536f, -7.328f)
                arcToRelative(1.02f, 1.02f, 1f, false, true, 1.928f, 0f)
                lineTo(22f, 16f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.697f, 14f)
                horizontalLineToRelative(5.606f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(2f, 16f)
                lineToRelative(4.039f, -9.69f)
                arcToRelative(.5f, .5f, 0f, false, true, .923f, 0f)
                lineTo(11f, 16f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.304f, 13f)
                horizontalLineToRelative(6.392f)
            }
}

public val LucideIcons.All.ALargeSmallDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ALargeSmall: ImageVector
    @Composable get() = ALargeSmallDefinition.asImageVector()
