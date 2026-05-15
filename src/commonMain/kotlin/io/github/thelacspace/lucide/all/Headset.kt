package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Headset") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3f, 11f)
                horizontalLineToRelative(3f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(3f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineTo(5f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineToRelative(-5f)
                close()
                moveToRelative(0f, 0f)
                arcToRelative(9f, 9f, 0f, true, true, 18f, 0f)
                moveToRelative(0f, 0f)
                verticalLineToRelative(5f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineToRelative(-1f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineToRelative(-3f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(3f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(21f, 16f)
                verticalLineToRelative(2f)
                arcToRelative(4f, 4f, 0f, false, true, -4f, 4f)
                horizontalLineToRelative(-5f)
            }
}

public val LucideIcons.All.HeadsetDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Headset: ImageVector
    @Composable get() = HeadsetDefinition.asImageVector()
