package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Mic") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 19f)
                verticalLineToRelative(3f)
            }
            lucidePath(strokeWidth) {
                moveTo(19f, 10f)
                verticalLineToRelative(2f)
                arcToRelative(7f, 7f, 0f, false, true, -14f, 0f)
                verticalLineToRelative(-2f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f, 2.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(3.0f, 0.0f, 0f, false, true, 3.0f, 0.0f)
                verticalLineToRelative(13.0f)
                arcToRelative(3.0f, 0.0f, 0f, false, true, -3.0f, 0.0f)
                horizontalLineToRelative(-0.0f)
                arcToRelative(3.0f, 0.0f, 0f, false, true, -3.0f, -0.0f)
                verticalLineToRelative(-13.0f)
                arcToRelative(3.0f, 0.0f, 0f, false, true, 3.0f, -0.0f)
                close()
            }
}

public val LucideIcons.All.MicDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Mic: ImageVector
    @Composable get() = MicDefinition.asImageVector()
