package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Rocket") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 15f)
                verticalLineToRelative(5f)
                reflectiveCurveToRelative(3.03f, -.55f, 4f, -2f)
                curveToRelative(1.08f, -1.62f, 0f, -5f, 0f, -5f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.5f, 16.5f)
                curveToRelative(-1.5f, 1.26f, -2f, 5f, -2f, 5f)
                reflectiveCurveToRelative(3.74f, -.5f, 5f, -2f)
                curveToRelative(.71f, -.84f, .7f, -2.13f, -.09f, -2.91f)
                arcToRelative(2.18f, 2.18f, 0f, false, false, -2.91f, -.09f)
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 12f)
                arcToRelative(22f, 22f, 0f, false, true, 2f, -3.95f)
                arcTo(12.88f, 12.88f, 0f, false, true, 22f, 2f)
                curveToRelative(0f, 2.72f, -.78f, 7.5f, -6f, 11f)
                arcToRelative(22.4f, 22.4f, 0f, false, true, -4f, 2f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 12f)
                horizontalLineTo(4f)
                reflectiveCurveToRelative(.55f, -3.03f, 2f, -4f)
                curveToRelative(1.62f, -1.08f, 5f, .05f, 5f, .05f)
            }
}

public val LucideIcons.All.RocketDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Rocket: ImageVector
    @Composable get() = RocketDefinition.asImageVector()
