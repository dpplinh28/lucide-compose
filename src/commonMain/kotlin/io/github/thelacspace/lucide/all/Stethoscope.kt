package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Stethoscope") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11f, 2f)
                verticalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(5f, 2f)
                verticalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(5f, 3f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(4f)
                arcToRelative(6f, 6f, 0f, false, false, 12f, 0f)
                verticalLineTo(5f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                horizontalLineToRelative(-1f)
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 15f)
                arcToRelative(6f, 6f, 0f, false, false, 12f, 0f)
                verticalLineToRelative(-3f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f, 10.0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, 4.0f, 0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, -4.0f, 0f)
            }
}

public val LucideIcons.All.StethoscopeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Stethoscope: ImageVector
    @Composable get() = StethoscopeDefinition.asImageVector()
