package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Stamp") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14f, 13f)
                verticalLineTo(8.5f)
                curveTo(14f, 7f, 15f, 7f, 15f, 5f)
                arcToRelative(3f, 3f, 0f, false, false, -6f, 0f)
                curveToRelative(0f, 2f, 1f, 2f, 1f, 3.5f)
                verticalLineTo(13f)
            }
            lucidePath(strokeWidth) {
                moveTo(20f, 15.5f)
                arcToRelative(2.5f, 2.5f, 0f, false, false, -2.5f, -2.5f)
                horizontalLineToRelative(-11f)
                arcTo(2.5f, 2.5f, 0f, false, false, 4f, 15.5f)
                verticalLineTo(17f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(14f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(5f, 22f)
                horizontalLineToRelative(14f)
            }
}

public val LucideIcons.All.StampDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Stamp: ImageVector
    @Composable get() = StampDefinition.asImageVector()
