package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MousePointer2") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.037f, 4.688f)
                arcToRelative(.495f, .495f, 0f, false, true, .651f, -.651f)
                lineToRelative(16f, 6.5f)
                arcToRelative(.5f, .5f, 0f, false, true, -.063f, .947f)
                lineToRelative(-6.124f, 1.58f)
                arcToRelative(2f, 2f, 0f, false, false, -1.438f, 1.435f)
                lineToRelative(-1.579f, 6.126f)
                arcToRelative(.5f, .5f, 0f, false, true, -.947f, .063f)
                close()
            }
}

public val LucideIcons.All.MousePointer2Definition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MousePointer2: ImageVector
    @Composable get() = MousePointer2Definition.asImageVector()
