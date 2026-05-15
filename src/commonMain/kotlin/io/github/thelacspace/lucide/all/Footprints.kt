package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Footprints") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4f, 16f)
                verticalLineToRelative(-2.38f)
                curveTo(4f, 11.5f, 2.97f, 10.5f, 3f, 8f)
                curveToRelative(.03f, -2.72f, 1.49f, -6f, 4.5f, -6f)
                curveTo(9.37f, 2f, 10f, 3.8f, 10f, 5.5f)
                curveToRelative(0f, 3.11f, -2f, 5.66f, -2f, 8.68f)
                verticalLineTo(16f)
                arcToRelative(2f, 2f, 0f, true, true, -4f, 0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(20f, 20f)
                verticalLineToRelative(-2.38f)
                curveToRelative(0f, -2.12f, 1.03f, -3.12f, 1f, -5.62f)
                curveToRelative(-.03f, -2.72f, -1.49f, -6f, -4.5f, -6f)
                curveTo(14.63f, 6f, 14f, 7.8f, 14f, 9.5f)
                curveToRelative(0f, 3.11f, 2f, 5.66f, 2f, 8.68f)
                verticalLineTo(20f)
                arcToRelative(2f, 2f, 0f, true, false, 4f, 0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 17f)
                horizontalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(4f, 13f)
                horizontalLineToRelative(4f)
            }
}

public val LucideIcons.All.FootprintsDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Footprints: ImageVector
    @Composable get() = FootprintsDefinition.asImageVector()
