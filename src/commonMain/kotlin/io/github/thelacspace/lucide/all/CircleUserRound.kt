package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CircleUserRound") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(17.925f, 20.056f)
                arcToRelative(6f, 6f, 0f, false, false, -11.851f, .001f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f, 11.0f)
                arcToRelative(4.0f, 4.0f, 0f, true, false, 8.0f, 0f)
                arcToRelative(4.0f, 4.0f, 0f, true, false, -8.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f, 12.0f)
                arcToRelative(10.0f, 10.0f, 0f, true, false, 20.0f, 0f)
                arcToRelative(10.0f, 10.0f, 0f, true, false, -20.0f, 0f)
            }
}

public val LucideIcons.All.CircleUserRoundDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CircleUserRound: ImageVector
    @Composable get() = CircleUserRoundDefinition.asImageVector()
