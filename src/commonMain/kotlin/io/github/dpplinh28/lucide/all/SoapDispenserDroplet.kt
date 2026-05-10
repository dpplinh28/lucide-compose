package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SoapDispenserDroplet") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.5f, 2f)
                verticalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(14f, 2f)
                horizontalLineTo(7f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.29f, 14.76f)
                arcTo(6.67f, 6.67f, 0f, false, true, 17f, 11f)
                arcToRelative(6.6f, 6.6f, 0f, false, true, -2.29f, 3.76f)
                curveToRelative(-1.15f, .92f, -1.71f, 2.04f, -1.71f, 3.19f)
                curveToRelative(0f, 2.22f, 1.8f, 4.05f, 4f, 4.05f)
                reflectiveCurveToRelative(4f, -1.83f, 4f, -4.05f)
                curveToRelative(0f, -1.16f, -.57f, -2.26f, -1.71f, -3.19f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.607f, 21f)
                horizontalLineTo(6f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineToRelative(-7f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(7f)
                verticalLineTo(7f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                horizontalLineTo(9f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(3f)
            }
}

public val LucideIcons.All.SoapDispenserDropletDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SoapDispenserDroplet: ImageVector
    @Composable get() = SoapDispenserDropletDefinition.asImageVector()
