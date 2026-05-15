package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Navigation2Off") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(9.31f, 9.31f)
                lineTo(5f, 21f)
                lineToRelative(7f, -4f)
                lineToRelative(7f, 4f)
                lineToRelative(-1.17f, -3.17f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.53f, 8.88f)
                lineTo(12f, 2f)
                lineToRelative(-1.17f, 3.17f)
            }
            lucidePath(strokeWidth) {
                moveTo(2f, 2f)
                lineTo(22f, 22f)
            }
}

public val LucideIcons.All.Navigation2OffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Navigation2Off: ImageVector
    @Composable get() = Navigation2OffDefinition.asImageVector()
