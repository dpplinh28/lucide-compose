package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CircleParkingOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.656f, 7f)
                horizontalLineTo(13f)
                arcToRelative(3f, 3f, 0f, false, true, 2.984f, 3.307f)
            }
            lucidePath(strokeWidth) {
                moveTo(13f, 13f)
                horizontalLineTo(9f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.071f, 19.071f)
                arcTo(1f, 1f, 0f, false, true, 4.93f, 4.93f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(2f, 2f)
                lineToRelative(20f, 20f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.357f, 2.687f)
                arcToRelative(10f, 10f, 0f, false, true, 12.956f, 12.956f)
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 17f)
                verticalLineTo(9f)
            }
}

public val LucideIcons.All.CircleParkingOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CircleParkingOff: ImageVector
    @Composable get() = CircleParkingOffDefinition.asImageVector()
