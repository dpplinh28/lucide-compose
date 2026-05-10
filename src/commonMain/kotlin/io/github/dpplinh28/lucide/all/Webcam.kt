package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Webcam") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.0f, 10.0f)
                arcToRelative(8.0f, 8.0f, 0f, true, false, 16.0f, 0f)
                arcToRelative(8.0f, 8.0f, 0f, true, false, -16.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f, 10.0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, 6.0f, 0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, -6.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7f, 22f)
                horizontalLineToRelative(10f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 22f)
                verticalLineToRelative(-4f)
            }
}

public val LucideIcons.All.WebcamDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Webcam: ImageVector
    @Composable get() = WebcamDefinition.asImageVector()
