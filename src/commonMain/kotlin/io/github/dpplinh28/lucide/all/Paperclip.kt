package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Paperclip") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(16f, 6f)
                lineToRelative(-8.414f, 8.586f)
                arcToRelative(2f, 2f, 0f, false, false, 2.829f, 2.829f)
                lineToRelative(8.414f, -8.586f)
                arcToRelative(4f, 4f, 0f, true, false, -5.657f, -5.657f)
                lineToRelative(-8.379f, 8.551f)
                arcToRelative(6f, 6f, 0f, true, false, 8.485f, 8.485f)
                lineToRelative(8.379f, -8.551f)
            }
}

public val LucideIcons.All.PaperclipDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Paperclip: ImageVector
    @Composable get() = PaperclipDefinition.asImageVector()
