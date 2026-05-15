package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Goal") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 13f)
                verticalLineTo(2f)
                lineToRelative(8f, 4f)
                lineToRelative(-8f, 4f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.561f, 10.222f)
                arcToRelative(9f, 9f, 0f, true, true, -12.55f, -5.29f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.002f, 9.997f)
                arcToRelative(5f, 5f, 0f, true, false, 8.9f, 2.02f)
            }
}

public val LucideIcons.All.GoalDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Goal: ImageVector
    @Composable get() = GoalDefinition.asImageVector()
