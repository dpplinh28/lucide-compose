package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ListRestart") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(21f, 5f)
                horizontalLineTo(3f)
            }
            lucidePath(strokeWidth) {
                moveTo(7f, 12f)
                horizontalLineTo(3f)
            }
            lucidePath(strokeWidth) {
                moveTo(7f, 19f)
                horizontalLineTo(3f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 18f)
                arcToRelative(5f, 5f, 0f, false, false, 9f, -3f)
                arcToRelative(4.5f, 4.5f, 0f, false, false, -4.5f, -4.5f)
                curveToRelative(-1.33f, 0f, -2.54f, .54f, -3.41f, 1.41f)
                lineTo(11f, 14f)
            }
            lucidePath(strokeWidth) {
                moveTo(11f, 10f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(4f)
            }
}

public val LucideIcons.All.ListRestartDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ListRestart: ImageVector
    @Composable get() = ListRestartDefinition.asImageVector()
