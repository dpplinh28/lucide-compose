package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("LampWallUp") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(19.929f, 9.629f)
                arcTo(1f, 1f, 0f, false, true, 19f, 11f)
                horizontalLineTo(9f)
                arcToRelative(1f, 1f, 0f, false, true, -.928f, -1.371f)
                lineToRelative(2f, -5f)
                arcTo(1f, 1f, 0f, false, true, 11f, 4f)
                horizontalLineToRelative(6f)
                arcToRelative(1f, 1f, 0f, false, true, .928f, .629f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(6f, 15f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(2f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineTo(5f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                verticalLineToRelative(-4f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 18f)
                horizontalLineToRelative(4f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineToRelative(-5f)
            }
}

public val LucideIcons.All.LampWallUpDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.LampWallUp: ImageVector
    @Composable get() = LampWallUpDefinition.asImageVector()
