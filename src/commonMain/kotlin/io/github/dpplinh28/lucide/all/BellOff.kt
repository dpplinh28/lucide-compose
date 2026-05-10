package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BellOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.268f, 21f)
                arcToRelative(2f, 2f, 0f, false, false, 3.464f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(17f, 17f)
                horizontalLineTo(4f)
                arcToRelative(1f, 1f, 0f, false, true, -.74f, -1.673f)
                curveTo(4.59f, 13.956f, 6f, 12.499f, 6f, 8f)
                arcToRelative(6f, 6f, 0f, false, true, .258f, -1.742f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(2f, 2f)
                lineToRelative(20f, 20f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.668f, 3.01f)
                arcTo(6f, 6f, 0f, false, true, 18f, 8f)
                curveToRelative(0f, 2.687f, .77f, 4.653f, 1.707f, 6.05f)
            }
}

public val LucideIcons.All.BellOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BellOff: ImageVector
    @Composable get() = BellOffDefinition.asImageVector()
