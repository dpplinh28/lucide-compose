package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CameraOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14.564f, 14.558f)
                arcToRelative(3f, 3f, 0f, true, true, -4.122f, -4.121f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(2f, 2f)
                lineToRelative(20f, 20f)
            }
            lucidePath(strokeWidth) {
                moveTo(20f, 20f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineTo(9f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(1.997f)
                arcToRelative(2f, 2f, 0f, false, false, .819f, -.175f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.695f, 4.024f)
                arcTo(2f, 2f, 0f, false, true, 10.004f, 4f)
                horizontalLineToRelative(3.993f)
                arcToRelative(2f, 2f, 0f, false, true, 1.76f, 1.05f)
                lineToRelative(.486f, .9f)
                arcTo(2f, 2f, 0f, false, false, 18.003f, 7f)
                horizontalLineTo(20f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(7.344f)
            }
}

public val LucideIcons.All.CameraOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CameraOff: ImageVector
    @Composable get() = CameraOffDefinition.asImageVector()
