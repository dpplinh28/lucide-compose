package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MousePointer") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.586f, 12.586f)
                lineTo(19f, 19f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.688f, 3.037f)
                arcToRelative(.497f, .497f, 0f, false, false, -.651f, .651f)
                lineToRelative(6.5f, 15.999f)
                arcToRelative(.501f, .501f, 0f, false, false, .947f, -.062f)
                lineToRelative(1.569f, -6.083f)
                arcToRelative(2f, 2f, 0f, false, true, 1.448f, -1.479f)
                lineToRelative(6.124f, -1.579f)
                arcToRelative(.5f, .5f, 0f, false, false, .063f, -.947f)
                close()
            }
}

public val LucideIcons.All.MousePointerDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MousePointer: ImageVector
    @Composable get() = MousePointerDefinition.asImageVector()
