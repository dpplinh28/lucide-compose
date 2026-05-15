package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("EarOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(6f, 18.5f)
                arcToRelative(3.5f, 3.5f, 0f, true, false, 7f, 0f)
                curveToRelative(0f, -1.57f, .92f, -2.52f, 2.04f, -3.46f)
            }
            lucidePath(strokeWidth) {
                moveTo(6f, 8.5f)
                curveToRelative(0f, -.75f, .13f, -1.47f, .36f, -2.14f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.8f, 3.15f)
                arcTo(6.5f, 6.5f, 0f, false, true, 19f, 8.5f)
                curveToRelative(0f, 1.63f, -.44f, 2.81f, -1.09f, 3.76f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.5f, 6f)
                arcTo(2.5f, 2.5f, 0f, false, true, 15f, 8.5f)
                moveTo(10f, 13f)
                arcToRelative(2f, 2f, 0f, false, false, 1.82f, -1.18f)
            }
            lucidePath(strokeWidth) {
                moveTo(2f, 2f)
                lineTo(22f, 22f)
            }
}

public val LucideIcons.All.EarOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.EarOff: ImageVector
    @Composable get() = EarOffDefinition.asImageVector()
