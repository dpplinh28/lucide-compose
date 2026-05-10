package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ClipboardPenLine") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(9.0f, 2.0f)
                horizontalLineToRelative(6.0f)
                arcToRelative(1.0f, 0.0f, 0f, false, true, 1.0f, 0.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(1.0f, 0.0f, 0f, false, true, -1.0f, 0.0f)
                horizontalLineToRelative(-6.0f)
                arcToRelative(1.0f, 0.0f, 0f, false, true, -1.0f, -0.0f)
                verticalLineToRelative(-4.0f)
                arcToRelative(1.0f, 0.0f, 0f, false, true, 1.0f, -0.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 4f)
                horizontalLineTo(6f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(14f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineToRelative(-.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 4f)
                horizontalLineToRelative(2f)
                arcToRelative(2f, 2f, 0f, false, true, 1.73f, 1f)
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 18f)
                horizontalLineToRelative(1f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.378f, 12.626f)
                arcToRelative(1f, 1f, 0f, false, false, -3.004f, -3.004f)
                lineToRelative(-4.01f, 4.012f)
                arcToRelative(2f, 2f, 0f, false, false, -.506f, .854f)
                lineToRelative(-.837f, 2.87f)
                arcToRelative(.5f, .5f, 0f, false, false, .62f, .62f)
                lineToRelative(2.87f, -.837f)
                arcToRelative(2f, 2f, 0f, false, false, .854f, -.506f)
                close()
            }
}

public val LucideIcons.All.ClipboardPenLineDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ClipboardPenLine: ImageVector
    @Composable get() = ClipboardPenLineDefinition.asImageVector()
