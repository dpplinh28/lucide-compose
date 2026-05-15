package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Cherry") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2f, 17f)
                arcToRelative(5f, 5f, 0f, false, false, 10f, 0f)
                curveToRelative(0f, -2.76f, -2.5f, -5f, -5f, -3f)
                curveToRelative(-2.5f, -2f, -5f, .24f, -5f, 3f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 17f)
                arcToRelative(5f, 5f, 0f, false, false, 10f, 0f)
                curveToRelative(0f, -2.76f, -2.5f, -5f, -5f, -3f)
                curveToRelative(-2.5f, -2f, -5f, .24f, -5f, 3f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(7f, 14f)
                curveToRelative(3.22f, -2.91f, 4.29f, -8.75f, 5f, -12f)
                curveToRelative(1.66f, 2.38f, 4.94f, 9f, 5f, 12f)
            }
            lucidePath(strokeWidth) {
                moveTo(22f, 9f)
                curveToRelative(-4.29f, 0f, -7.14f, -2.33f, -10f, -7f)
                curveToRelative(5.71f, 0f, 10f, 4.67f, 10f, 7f)
                close()
            }
}

public val LucideIcons.All.CherryDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Cherry: ImageVector
    @Composable get() = CherryDefinition.asImageVector()
