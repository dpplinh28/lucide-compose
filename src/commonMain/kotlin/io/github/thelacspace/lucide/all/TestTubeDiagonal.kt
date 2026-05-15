package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("TestTubeDiagonal") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(21f, 7f)
                lineTo(6.82f, 21.18f)
                arcToRelative(2.83f, 2.83f, 0f, false, true, -3.99f, -.01f)
                arcToRelative(2.83f, 2.83f, 0f, false, true, 0f, -4f)
                lineTo(17f, 3f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(16f, 2f)
                lineToRelative(6f, 6f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 16f)
                horizontalLineTo(4f)
            }
}

public val LucideIcons.All.TestTubeDiagonalDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.TestTubeDiagonal: ImageVector
    @Composable get() = TestTubeDiagonalDefinition.asImageVector()
