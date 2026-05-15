package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("RefreshCwOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(21f, 8f)
                lineTo(18.74f, 5.74f)
                arcTo(9.75f, 9.75f, 0f, false, false, 12f, 3f)
                curveTo(11f, 3f, 10.03f, 3.16f, 9.13f, 3.47f)
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 16f)
                horizontalLineTo(3f)
                verticalLineToRelative(5f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 12f)
                curveTo(3f, 9.51f, 4f, 7.26f, 5.64f, 5.64f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(3f, 16f)
                lineToRelative(2.26f, 2.26f)
                arcTo(9.75f, 9.75f, 0f, false, false, 12f, 21f)
                curveToRelative(2.49f, 0f, 4.74f, -1f, 6.36f, -2.64f)
            }
            lucidePath(strokeWidth) {
                moveTo(21f, 12f)
                curveToRelative(0f, 1f, -.16f, 1.97f, -.47f, 2.87f)
            }
            lucidePath(strokeWidth) {
                moveTo(21f, 3f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-5f)
            }
            lucidePath(strokeWidth) {
                moveTo(22f, 22f)
                lineTo(2f, 2f)
            }
}

public val LucideIcons.All.RefreshCwOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.RefreshCwOff: ImageVector
    @Composable get() = RefreshCwOffDefinition.asImageVector()
