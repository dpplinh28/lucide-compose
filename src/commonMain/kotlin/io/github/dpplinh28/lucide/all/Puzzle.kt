package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Puzzle") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.39f, 4.39f)
                arcToRelative(1f, 1f, 0f, false, false, 1.68f, -.474f)
                arcToRelative(2.5f, 2.5f, 0f, true, true, 3.014f, 3.015f)
                arcToRelative(1f, 1f, 0f, false, false, -.474f, 1.68f)
                lineToRelative(1.683f, 1.682f)
                arcToRelative(2.414f, 2.414f, 0f, false, true, 0f, 3.414f)
                lineTo(19.61f, 15.39f)
                arcToRelative(1f, 1f, 0f, false, true, -1.68f, -.474f)
                arcToRelative(2.5f, 2.5f, 0f, true, false, -3.014f, 3.015f)
                arcToRelative(1f, 1f, 0f, false, true, .474f, 1.68f)
                lineToRelative(-1.683f, 1.682f)
                arcToRelative(2.414f, 2.414f, 0f, false, true, -3.414f, 0f)
                lineTo(8.61f, 19.61f)
                arcToRelative(1f, 1f, 0f, false, false, -1.68f, .474f)
                arcToRelative(2.5f, 2.5f, 0f, true, true, -3.014f, -3.015f)
                arcToRelative(1f, 1f, 0f, false, false, .474f, -1.68f)
                lineToRelative(-1.683f, -1.682f)
                arcToRelative(2.414f, 2.414f, 0f, false, true, 0f, -3.414f)
                lineTo(4.39f, 8.61f)
                arcToRelative(1f, 1f, 0f, false, true, 1.68f, .474f)
                arcToRelative(2.5f, 2.5f, 0f, true, false, 3.014f, -3.015f)
                arcToRelative(1f, 1f, 0f, false, true, -.474f, -1.68f)
                lineToRelative(1.683f, -1.682f)
                arcToRelative(2.414f, 2.414f, 0f, false, true, 3.414f, 0f)
                close()
            }
}

public val LucideIcons.All.PuzzleDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Puzzle: ImageVector
    @Composable get() = PuzzleDefinition.asImageVector()
