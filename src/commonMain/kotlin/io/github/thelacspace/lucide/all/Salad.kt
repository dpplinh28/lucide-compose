package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Salad") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(7f, 21f)
                horizontalLineToRelative(10f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 21f)
                arcToRelative(9f, 9f, 0f, false, false, 9f, -9f)
                horizontalLineTo(3f)
                arcToRelative(9f, 9f, 0f, false, false, 9f, 9f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(11.38f, 12f)
                arcToRelative(2.4f, 2.4f, 0f, false, true, -.4f, -4.77f)
                arcToRelative(2.4f, 2.4f, 0f, false, true, 3.2f, -2.77f)
                arcToRelative(2.4f, 2.4f, 0f, false, true, 3.47f, -.63f)
                arcToRelative(2.4f, 2.4f, 0f, false, true, 3.37f, 3.37f)
                arcToRelative(2.4f, 2.4f, 0f, false, true, -1.1f, 3.7f)
                arcToRelative(2.51f, 2.51f, 0f, false, true, .03f, 1.1f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(13f, 12f)
                lineToRelative(4f, -4f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.9f, 7.25f)
                arcTo(3.99f, 3.99f, 0f, false, false, 4f, 10f)
                curveToRelative(0f, .73f, .2f, 1.41f, .54f, 2f)
            }
}

public val LucideIcons.All.SaladDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Salad: ImageVector
    @Composable get() = SaladDefinition.asImageVector()
