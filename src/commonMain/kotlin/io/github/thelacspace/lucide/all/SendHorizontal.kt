package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SendHorizontal") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3.714f, 3.048f)
                arcToRelative(.498f, .498f, 0f, false, false, -.683f, .627f)
                lineToRelative(2.843f, 7.627f)
                arcToRelative(2f, 2f, 0f, false, true, 0f, 1.396f)
                lineToRelative(-2.842f, 7.627f)
                arcToRelative(.498f, .498f, 0f, false, false, .682f, .627f)
                lineToRelative(18f, -8.5f)
                arcToRelative(.5f, .5f, 0f, false, false, 0f, -.904f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(6f, 12f)
                horizontalLineToRelative(16f)
            }
}

public val LucideIcons.All.SendHorizontalDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SendHorizontal: ImageVector
    @Composable get() = SendHorizontalDefinition.asImageVector()
