package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("NutOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 4f)
                verticalLineTo(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(5f, 10f)
                verticalLineToRelative(4f)
                arcToRelative(7.004f, 7.004f, 0f, false, false, 5.277f, 6.787f)
                curveToRelative(.412f, .104f, .802f, .292f, 1.102f, .592f)
                lineTo(12f, 22f)
                lineToRelative(.621f, -.621f)
                curveToRelative(.3f, -.3f, .69f, -.488f, 1.102f, -.592f)
                arcToRelative(7.01f, 7.01f, 0f, false, false, 4.125f, -2.939f)
            }
            lucidePath(strokeWidth) {
                moveTo(19f, 10f)
                verticalLineToRelative(3.343f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 12f)
                curveToRelative(-1.349f, -.573f, -1.905f, -1.005f, -2.5f, -2f)
                curveToRelative(-.546f, .902f, -1.048f, 1.353f, -2.5f, 2f)
                curveToRelative(-1.018f, -.644f, -1.46f, -1.08f, -2f, -2f)
                curveToRelative(-1.028f, .71f, -1.69f, .918f, -3f, 1f)
                curveToRelative(1.081f, -1.048f, 1.757f, -2.03f, 2f, -3f)
                curveToRelative(.194f, -.776f, .84f, -1.551f, 1.79f, -2.21f)
                moveToRelative(11.654f, 5.997f)
                curveToRelative(.887f, -.457f, 1.28f, -.891f, 1.556f, -1.787f)
                curveToRelative(1.032f, .916f, 1.683f, 1.157f, 3f, 1f)
                curveToRelative(-1.297f, -1.036f, -1.758f, -2.03f, -2f, -3f)
                curveToRelative(-.5f, -2f, -4f, -4f, -8f, -4f)
                curveToRelative(-.74f, 0f, -1.461f, .068f, -2.15f, .192f)
            }
            lucidePath(strokeWidth) {
                moveTo(2f, 2f)
                lineTo(22f, 22f)
            }
}

public val LucideIcons.All.NutOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.NutOff: ImageVector
    @Composable get() = NutOffDefinition.asImageVector()
