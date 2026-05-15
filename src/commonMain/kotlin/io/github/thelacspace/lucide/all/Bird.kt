package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Bird") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16f, 7f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.4f, 18f)
                horizontalLineTo(12f)
                arcToRelative(8f, 8f, 0f, false, false, 8f, -8f)
                verticalLineTo(7f)
                arcToRelative(4f, 4f, 0f, false, false, -7.28f, -2.3f)
                lineTo(2f, 20f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(20f, 7f)
                lineToRelative(2f, .5f)
                lineToRelative(-2f, .5f)
            }
            lucidePath(strokeWidth) {
                moveTo(10f, 18f)
                verticalLineToRelative(3f)
            }
            lucidePath(strokeWidth) {
                moveTo(14f, 17.75f)
                verticalLineTo(21f)
            }
            lucidePath(strokeWidth) {
                moveTo(7f, 18f)
                arcToRelative(6f, 6f, 0f, false, false, 3.84f, -10.61f)
            }
}

public val LucideIcons.All.BirdDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Bird: ImageVector
    @Composable get() = BirdDefinition.asImageVector()
