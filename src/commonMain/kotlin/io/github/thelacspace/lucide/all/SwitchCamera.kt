package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SwitchCamera") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11f, 19f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineTo(7f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(5f)
            }
            lucidePath(strokeWidth) {
                moveTo(13f, 5f)
                horizontalLineToRelative(7f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(10f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineToRelative(-5f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f, 12.0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, 6.0f, 0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, -6.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(18f, 22f)
                lineToRelative(-3f, -3f)
                lineToRelative(3f, -3f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(6f, 2f)
                lineToRelative(3f, 3f)
                lineToRelative(-3f, 3f)
            }
}

public val LucideIcons.All.SwitchCameraDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SwitchCamera: ImageVector
    @Composable get() = SwitchCameraDefinition.asImageVector()
