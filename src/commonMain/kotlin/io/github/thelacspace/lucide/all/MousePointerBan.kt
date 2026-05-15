package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MousePointerBan") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.034f, 2.681f)
                arcToRelative(.498f, .498f, 0f, false, true, .647f, -.647f)
                lineToRelative(9f, 3.5f)
                arcToRelative(.5f, .5f, 0f, false, true, -.033f, .944f)
                lineTo(8.204f, 7.545f)
                arcToRelative(1f, 1f, 0f, false, false, -.66f, .66f)
                lineToRelative(-1.066f, 3.443f)
                arcToRelative(.5f, .5f, 0f, false, true, -.944f, .033f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f, 16.0f)
                arcToRelative(6.0f, 6.0f, 0f, true, false, 12.0f, 0f)
                arcToRelative(6.0f, 6.0f, 0f, true, false, -12.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(11.8f, 11.8f)
                lineToRelative(8.4f, 8.4f)
            }
}

public val LucideIcons.All.MousePointerBanDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MousePointerBan: ImageVector
    @Composable get() = MousePointerBanDefinition.asImageVector()
