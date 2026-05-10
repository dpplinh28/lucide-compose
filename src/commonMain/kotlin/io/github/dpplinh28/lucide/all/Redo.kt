package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Redo") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(21f, 7f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-6f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 17f)
                arcToRelative(9f, 9f, 0f, false, true, 9f, -9f)
                arcToRelative(9f, 9f, 0f, false, true, 6f, 2.3f)
                lineToRelative(3f, 2.7f)
            }
}

public val LucideIcons.All.RedoDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Redo: ImageVector
    @Composable get() = RedoDefinition.asImageVector()
