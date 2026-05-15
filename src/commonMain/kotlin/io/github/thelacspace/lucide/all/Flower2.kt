package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Flower2") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 5f)
                arcToRelative(3f, 3f, 0f, true, true, 3f, 3f)
                moveToRelative(-3f, -3f)
                arcToRelative(3f, 3f, 0f, true, false, -3f, 3f)
                moveToRelative(3f, -3f)
                verticalLineToRelative(1f)
                moveTo(9f, 8f)
                arcToRelative(3f, 3f, 0f, true, false, 3f, 3f)
                moveTo(9f, 8f)
                horizontalLineToRelative(1f)
                moveToRelative(5f, 0f)
                arcToRelative(3f, 3f, 0f, true, true, -3f, 3f)
                moveToRelative(3f, -3f)
                horizontalLineToRelative(-1f)
                moveToRelative(-2f, 3f)
                verticalLineToRelative(-1f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f, 8.0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, 4.0f, 0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, -4.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 10f)
                verticalLineToRelative(12f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 22f)
                curveToRelative(4.2f, 0f, 7f, -1.667f, 7f, -5f)
                curveToRelative(-4.2f, 0f, -7f, 1.667f, -7f, 5f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 22f)
                curveToRelative(-4.2f, 0f, -7f, -1.667f, -7f, -5f)
                curveToRelative(4.2f, 0f, 7f, 1.667f, 7f, 5f)
                close()
            }
}

public val LucideIcons.All.Flower2Definition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Flower2: ImageVector
    @Composable get() = Flower2Definition.asImageVector()
