package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("UserRoundPen") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2f, 21f)
                arcToRelative(8f, 8f, 0f, false, true, 10.821f, -7.487f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.378f, 16.626f)
                arcToRelative(1f, 1f, 0f, false, false, -3.004f, -3.004f)
                lineToRelative(-4.01f, 4.012f)
                arcToRelative(2f, 2f, 0f, false, false, -.506f, .854f)
                lineToRelative(-.837f, 2.87f)
                arcToRelative(.5f, .5f, 0f, false, false, .62f, .62f)
                lineToRelative(2.87f, -.837f)
                arcToRelative(2f, 2f, 0f, false, false, .854f, -.506f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f, 8.0f)
                arcToRelative(5.0f, 5.0f, 0f, true, false, 10.0f, 0f)
                arcToRelative(5.0f, 5.0f, 0f, true, false, -10.0f, 0f)
            }
}

public val LucideIcons.All.UserRoundPenDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.UserRoundPen: ImageVector
    @Composable get() = UserRoundPenDefinition.asImageVector()
