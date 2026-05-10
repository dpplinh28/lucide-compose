package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Camera") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(13.997f, 4f)
                arcToRelative(2f, 2f, 0f, false, true, 1.76f, 1.05f)
                lineToRelative(.486f, .9f)
                arcTo(2f, 2f, 0f, false, false, 18.003f, 7f)
                horizontalLineTo(20f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(9f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineTo(9f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(1.997f)
                arcToRelative(2f, 2f, 0f, false, false, 1.759f, -1.048f)
                lineToRelative(.489f, -.904f)
                arcTo(2f, 2f, 0f, false, true, 10.004f, 4f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f, 13.0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, 6.0f, 0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, -6.0f, 0f)
            }
}

public val LucideIcons.All.CameraDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Camera: ImageVector
    @Composable get() = CameraDefinition.asImageVector()
