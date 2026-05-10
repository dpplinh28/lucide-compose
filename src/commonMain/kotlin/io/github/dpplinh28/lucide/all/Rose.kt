package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Rose") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(17f, 10f)
                horizontalLineToRelative(-1f)
                arcToRelative(4f, 4f, 0f, true, true, 4f, -4f)
                verticalLineToRelative(.534f)
            }
            lucidePath(strokeWidth) {
                moveTo(17f, 6f)
                horizontalLineToRelative(1f)
                arcToRelative(4f, 4f, 0f, false, true, 1.42f, 7.74f)
                lineToRelative(-2.29f, .87f)
                arcToRelative(6f, 6f, 0f, false, true, -5.339f, -10.68f)
                lineToRelative(2.069f, -1.31f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.5f, 17f)
                curveToRelative(2.8f, -.5f, 4.4f, 0f, 5.5f, .8f)
                reflectiveCurveToRelative(1.8f, 2.2f, 2.3f, 3.7f)
                curveToRelative(-2f, .4f, -3.5f, .4f, -4.8f, -.3f)
                curveToRelative(-1.2f, -.6f, -2.3f, -1.9f, -3f, -4.2f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.77f, 12f)
                curveTo(4f, 15f, 2f, 22f, 2f, 22f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f, 8.0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, 4.0f, 0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, -4.0f, 0f)
            }
}

public val LucideIcons.All.RoseDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Rose: ImageVector
    @Composable get() = RoseDefinition.asImageVector()
