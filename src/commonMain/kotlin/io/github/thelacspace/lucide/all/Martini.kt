package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Martini") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(8f, 22f)
                horizontalLineToRelative(8f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 11f)
                verticalLineToRelative(11f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(19f, 3f)
                lineToRelative(-7f, 8f)
                lineToRelative(-7f, -8f)
                close()
            }
}

public val LucideIcons.All.MartiniDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Martini: ImageVector
    @Composable get() = MartiniDefinition.asImageVector()
