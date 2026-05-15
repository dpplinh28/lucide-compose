package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Flashlight") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 13f)
                verticalLineToRelative(1f)
            }
            lucidePath(strokeWidth) {
                moveTo(17f, 2f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(4f)
                arcToRelative(3f, 3f, 0f, false, true, -.6f, 1.8f)
                lineToRelative(-.6f, .8f)
                arcTo(4f, 4f, 0f, false, false, 16f, 12f)
                verticalLineToRelative(8f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineTo(10f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineToRelative(-8f)
                arcToRelative(4f, 4f, 0f, false, false, -.8f, -2.4f)
                lineToRelative(-.6f, -.8f)
                arcTo(3f, 3f, 0f, false, true, 6f, 7f)
                verticalLineTo(3f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(6f, 6f)
                horizontalLineToRelative(12f)
            }
}

public val LucideIcons.All.FlashlightDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Flashlight: ImageVector
    @Composable get() = FlashlightDefinition.asImageVector()
