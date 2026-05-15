package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Pin") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 17f)
                verticalLineToRelative(5f)
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 10.76f)
                arcToRelative(2f, 2f, 0f, false, true, -1.11f, 1.79f)
                lineToRelative(-1.78f, .9f)
                arcTo(2f, 2f, 0f, false, false, 5f, 15.24f)
                verticalLineTo(16f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(12f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                verticalLineToRelative(-.76f)
                arcToRelative(2f, 2f, 0f, false, false, -1.11f, -1.79f)
                lineToRelative(-1.78f, -.9f)
                arcTo(2f, 2f, 0f, false, true, 15f, 10.76f)
                verticalLineTo(7f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                arcToRelative(2f, 2f, 0f, false, false, 0f, -4f)
                horizontalLineTo(8f)
                arcToRelative(2f, 2f, 0f, false, false, 0f, 4f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                close()
            }
}

public val LucideIcons.All.PinDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Pin: ImageVector
    @Composable get() = PinDefinition.asImageVector()
