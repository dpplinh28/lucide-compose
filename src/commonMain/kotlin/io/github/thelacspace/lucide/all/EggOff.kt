package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("EggOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(2f, 2f)
                lineToRelative(20f, 20f)
            }
            lucidePath(strokeWidth) {
                moveTo(20f, 14.347f)
                verticalLineTo(14f)
                curveToRelative(0f, -6f, -4f, -12f, -8f, -12f)
                curveToRelative(-1.078f, 0f, -2.157f, .436f, -3.157f, 1.19f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.206f, 6.21f)
                curveTo(4.871f, 8.4f, 4f, 11.2f, 4f, 14f)
                arcToRelative(8f, 8f, 0f, false, false, 14.568f, 4.568f)
            }
}

public val LucideIcons.All.EggOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.EggOff: ImageVector
    @Composable get() = EggOffDefinition.asImageVector()
