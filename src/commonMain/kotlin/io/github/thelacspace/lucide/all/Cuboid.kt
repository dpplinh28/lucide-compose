package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Cuboid") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10f, 22f)
                verticalLineToRelative(-8f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.336f, 8.89f)
                lineTo(10f, 14f)
                lineToRelative(11.715f, -7.029f)
            }
            lucidePath(strokeWidth) {
                moveTo(22f, 14f)
                arcToRelative(2f, 2f, 0f, false, true, -.971f, 1.715f)
                lineToRelative(-10f, 6f)
                arcToRelative(2f, 2f, 0f, false, true, -2.138f, -.05f)
                lineToRelative(-6f, -4f)
                arcTo(2f, 2f, 0f, false, true, 2f, 16f)
                verticalLineToRelative(-6f)
                arcToRelative(2f, 2f, 0f, false, true, .971f, -1.715f)
                lineToRelative(10f, -6f)
                arcToRelative(2f, 2f, 0f, false, true, 2.138f, .05f)
                lineToRelative(6f, 4f)
                arcTo(2f, 2f, 0f, false, true, 22f, 8f)
                close()
            }
}

public val LucideIcons.All.CuboidDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Cuboid: ImageVector
    @Composable get() = CuboidDefinition.asImageVector()
