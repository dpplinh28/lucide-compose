package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("UserRoundCheck") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2f, 21f)
                arcToRelative(8f, 8f, 0f, false, true, 13.292f, -6f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f, 8.0f)
                arcToRelative(5.0f, 5.0f, 0f, true, false, 10.0f, 0f)
                arcToRelative(5.0f, 5.0f, 0f, true, false, -10.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(16f, 19f)
                lineToRelative(2f, 2f)
                lineToRelative(4f, -4f)
            }
}

public val LucideIcons.All.UserRoundCheckDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.UserRoundCheck: ImageVector
    @Composable get() = UserRoundCheckDefinition.asImageVector()
