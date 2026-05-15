package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Router") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.0f, 14.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, 2.0f, 0.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, -2.0f, 0.0f)
                horizontalLineToRelative(-16.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, -2.0f, -0.0f)
                verticalLineToRelative(-8.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, 2.0f, -0.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(6.01f, 18f)
                horizontalLineTo(6f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.01f, 18f)
                horizontalLineTo(10f)
            }
            lucidePath(strokeWidth) {
                moveTo(15f, 10f)
                verticalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.84f, 7.17f)
                arcToRelative(4f, 4f, 0f, false, false, -5.66f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.66f, 4.34f)
                arcToRelative(8f, 8f, 0f, false, false, -11.31f, 0f)
            }
}

public val LucideIcons.All.RouterDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Router: ImageVector
    @Composable get() = RouterDefinition.asImageVector()
