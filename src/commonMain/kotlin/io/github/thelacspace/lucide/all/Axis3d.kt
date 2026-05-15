package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Axis3d") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(13.5f, 10.5f)
                lineTo(15f, 9f)
            }
            lucidePath(strokeWidth) {
                moveTo(4f, 4f)
                verticalLineToRelative(15f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(15f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.293f, 19.707f)
                lineTo(6f, 18f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(9f, 15f)
                lineToRelative(1.5f, -1.5f)
            }
}

public val LucideIcons.All.Axis3dDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Axis3d: ImageVector
    @Composable get() = Axis3dDefinition.asImageVector()
