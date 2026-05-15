package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Pill") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(10.5f, 20.5f)
                lineToRelative(10f, -10f)
                arcToRelative(4.95f, 4.95f, 0f, true, false, -7f, -7f)
                lineToRelative(-10f, 10f)
                arcToRelative(4.95f, 4.95f, 0f, true, false, 7f, 7f)
                close()
            }
            lucidePath(strokeWidth) {
                moveToRelative(8.5f, 8.5f)
                lineToRelative(7f, 7f)
            }
}

public val LucideIcons.All.PillDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Pill: ImageVector
    @Composable get() = PillDefinition.asImageVector()
