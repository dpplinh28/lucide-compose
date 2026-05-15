package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Microscope") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(6f, 18f)
                horizontalLineToRelative(8f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 22f)
                horizontalLineToRelative(18f)
            }
            lucidePath(strokeWidth) {
                moveTo(14f, 22f)
                arcToRelative(7f, 7f, 0f, true, false, 0f, -14f)
                horizontalLineToRelative(-1f)
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 14f)
                horizontalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 12f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineTo(6f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(4f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 6f)
                verticalLineTo(3f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                horizontalLineTo(9f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(3f)
            }
}

public val LucideIcons.All.MicroscopeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Microscope: ImageVector
    @Composable get() = MicroscopeDefinition.asImageVector()
