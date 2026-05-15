package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Rewind") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 6f)
                arcToRelative(2f, 2f, 0f, false, false, -3.414f, -1.414f)
                lineToRelative(-6f, 6f)
                arcToRelative(2f, 2f, 0f, false, false, 0f, 2.828f)
                lineToRelative(6f, 6f)
                arcTo(2f, 2f, 0f, false, false, 12f, 18f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(22f, 6f)
                arcToRelative(2f, 2f, 0f, false, false, -3.414f, -1.414f)
                lineToRelative(-6f, 6f)
                arcToRelative(2f, 2f, 0f, false, false, 0f, 2.828f)
                lineToRelative(6f, 6f)
                arcTo(2f, 2f, 0f, false, false, 22f, 18f)
                close()
            }
}

public val LucideIcons.All.RewindDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Rewind: ImageVector
    @Composable get() = RewindDefinition.asImageVector()
