package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BellRing") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.268f, 21f)
                arcToRelative(2f, 2f, 0f, false, false, 3.464f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(22f, 8f)
                curveToRelative(0f, -2.3f, -.8f, -4.3f, -2f, -6f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.262f, 15.326f)
                arcTo(1f, 1f, 0f, false, false, 4f, 17f)
                horizontalLineToRelative(16f)
                arcToRelative(1f, 1f, 0f, false, false, .74f, -1.673f)
                curveTo(19.41f, 13.956f, 18f, 12.499f, 18f, 8f)
                arcTo(6f, 6f, 0f, false, false, 6f, 8f)
                curveToRelative(0f, 4.499f, -1.411f, 5.956f, -2.738f, 7.326f)
            }
            lucidePath(strokeWidth) {
                moveTo(4f, 2f)
                curveTo(2.8f, 3.7f, 2f, 5.7f, 2f, 8f)
            }
}

public val LucideIcons.All.BellRingDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BellRing: ImageVector
    @Composable get() = BellRingDefinition.asImageVector()
