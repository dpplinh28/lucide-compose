package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("PocketKnife") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3f, 2f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 1f, 2f, 1f, 2f, 2f)
                reflectiveCurveTo(3f, 6f, 3f, 7f)
                reflectiveCurveToRelative(2f, 1f, 2f, 2f)
                reflectiveCurveToRelative(-2f, 1f, -2f, 2f)
                reflectiveCurveToRelative(2f, 1f, 2f, 2f)
            }
            lucidePath(strokeWidth) {
                moveTo(18f, 6f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(6f, 18f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.83f, 8.83f)
                arcToRelative(4f, 4f, 0f, false, false, -5.66f, -5.66f)
                lineToRelative(-12f, 12f)
                arcToRelative(4f, 4f, 0f, true, false, 5.66f, 5.66f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(18f, 11.66f)
                verticalLineTo(22f)
                arcToRelative(4f, 4f, 0f, false, false, 4f, -4f)
                verticalLineTo(6f)
            }
}

public val LucideIcons.All.PocketKnifeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.PocketKnife: ImageVector
    @Composable get() = PocketKnifeDefinition.asImageVector()
